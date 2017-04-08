package com.common.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.platform.model.TblStaff;
import com.common.platform.service.IStaffService;
import com.common.platform.utils.dto.PageDto;

@Controller
@RequestMapping("/common/platform/user")
public class UserController extends BaseController{

	@Autowired
	private IStaffService staffService;
	
	@RequestMapping("/{page}")
	public String findUserByPage(@PathVariable("page") int page){
		String param=request.getParameter("search");
		//System.out.println(param);
		if(param == null){
			PageDto<TblStaff> dto = staffService.getPageStaff(page);
			request.setAttribute("staff", dto);
			if(dto != null){
				request.setAttribute("pageModel", dto.getModel());
			}
		}else{
			PageDto<TblStaff> dto = staffService.getSearchStaff(page, param);
//System.out.println(dto.getData().size()+"=="+param +"=="+dto.getModel().getTotalPage());
			request.setAttribute("staff", dto);
			request.setAttribute("search", param);
			if(dto != null){
				request.setAttribute("pageModel", dto.getModel());
			}
		}
		String path=request.getContextPath();
		//System.out.println("path-===="+path);
		String uri=request.getRequestURI();
		uri=uri.replace(path, "");
		//System.out.println(uri.indexOf(path)+"------------");
		//uri.lastIndexOf(str)
		int index=uri.lastIndexOf("/");
		//System.out.println(uri.substring(uri.lastIndexOf(path),index)+"================================");
		String realPath=uri.substring(1, index);
		//realPath与下面的servletPath是一样的，
		//System.out.println(uri.substring(1, index)+"=====================");
		//System.out.println(request.getpa);
		//System.out.println(request.getRequestURL() +"=== uri" +request.getRequestURI());
		String servletPath=request.getServletPath();
		servletPath=servletPath.substring(1, servletPath.lastIndexOf("/"));
		//System.out.println(servletPath+"=====getServletPath");
		request.setAttribute("realPath", servletPath);
		return "c_user";
	}
	
}
