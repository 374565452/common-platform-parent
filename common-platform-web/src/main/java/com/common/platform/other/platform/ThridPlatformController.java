package com.common.platform.other.platform;

import java.io.File;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.common.platform.utils.TarUtils;
import com.common.platform.web.controller.BaseController;

@Controller
public class ThridPlatformController extends BaseController {

	// @RequestMapping("/thrid")
	public void processThridPost(HttpServletRequest request) throws Exception {
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
							+ file.getOriginalFilename();
					// 转存文件
					file.transferTo(new File(filePath));
				}

			}

		}
	}

	@RequestMapping("/checkHeart")
	public void checkHeart(@RequestParam("filename") MultipartFile file, @RequestParam("name") String name)
			throws Exception {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {

				String fileName = file.getOriginalFilename();
				String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/";
				// 转存文件
				file.transferTo(new File(filePath + fileName));
				// 这里转存后，要进行解压操作
				TarUtils.dearchive(filePath);
				// 得到xml文档，这里进行数据解析
				String taskNo = fileName.substring(fileName.indexOf("_"), fileName.lastIndexOf("."));
				String xmlFile = filePath + "EBDI_" + taskNo + ".xml";
				// 在里进行xml文件的解析

				//通用格式返回
				String responPath = request.getSession().getServletContext().getRealPath("/") + "response/";
				String resFile = doResponse(responPath);
				String taskNo2 = resFile.substring(resFile.indexOf("_"), resFile.lastIndexOf("."));
				String responseFile=responPath+"EBDT_"+taskNo2+".tar";
				TarUtils.archive(responPath+resFile,responseFile);
				
				//response.setContentType(type);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
