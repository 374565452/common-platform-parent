package com.common.platform.web.controller;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.springframework.beans.factory.annotation.Autowired;

import com.common.platform.utils.JsonResult;
import com.common.platform.utils.dto.PageDto;

public class BaseController {

	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	public JsonResult onResult(Object value,int status,String errorMsg){
		if(value != null){
			return JsonResult.ok(value);
		}
		return JsonResult.build(status, errorMsg);
	}
	
	protected void  setModel(PageDto<?> dto) {
		if(dto !=null){
			request.setAttribute("pageModel", dto.getModel());
		}
	}
	protected String doResponse(String path) throws Exception{
		// 创建根节点 并设置它的属性 ;     
        Element root = new Element("EBDResponse");
        // 将根节点添加到文档中；     
        Document Doc = new Document(root);     
          
           // 创建节点 book;     
           Element result = new Element("ResultCode").setText("2");  
           root.addContent(result); 
           Element desc =new Element("ResultDesc").setText("");
           root.addContent(desc);
           // 给 book 节点添加子节点并赋值；     
           //elements.addContent(new Element("id").    
           //elements.addContent(new Element("name").setText(books[i].getBook_name()));    
           //    
            //EBDI_11111111111.xml;
        // 输出 books.xml 文件；    
        // 使xml文件 缩进效果  
        Format format = Format.getPrettyFormat();  
        XMLOutputter XMLOut = new XMLOutputter(format);  
        XMLOut.output(Doc, new FileOutputStream(path+"EBDI_11111111111.xml"));  
        return "EBDI_11111111111.xml";
	}
	
	protected void setRealPath(){
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
	}
	
}
