package com.common.platform.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
