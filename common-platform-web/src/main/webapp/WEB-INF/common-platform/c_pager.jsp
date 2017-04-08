<%@page import="java.text.SimpleDateFormat,com.common.platform.utils.dto.PageDto,com.common.platform.utils.dto.PageModel,com.common.platform.model.TblStaff,java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
											String realPath=(String)request.getAttribute("realPath");
											PageModel model=(PageModel)request.getAttribute("pageModel");
											String param=(String)request.getAttribute("search");
											if(param != null){
												%>
										<!-- start pager -->
											<%
											
											if(model != null){
												//PageModel model=dto.getModel();
											
										%>
										<ul class="pager">
											<% 
												if(model.getCurrentPage()!=1){
											%>
  											<li class="previous"><a href="<%=realPath %>/<%=model.getPre()%>?search=<%=param%>">«</a></li>
  											<%} %>
  											<% if(model.getCurrentPage()==1) {%>
										  	<li class="active"><a href="<%=realPath %>/<%=model.getCurrentPage()%>?search=<%=param%>"><%=model.getCurrentPage() %></a></li>
										  	<li><a href="<%=realPath %>/<%=model.getCurrentPage()+1%>?search=<%=param%>"><%=model.getCurrentPage()+1 %></a></li>
										  	<%}else{ %>
										  	<li><a href="<%=realPath %>/<%=model.getCurrentPage()-1%>?search=<%=param%>"><%=model.getCurrentPage()-1 %></a></li>
										  	<li class="active"><a href="<%=realPath %>/<%=model.getCurrentPage()%>?search=<%=param%>"><%=model.getCurrentPage() %></a></li>
										  	<%} %>
										  	<% if(model.getNext()!=model.getTotalPage()){ 
										  		
										  	%>
										  	<li><a href="<%=realPath %>/<%=model.getNext()%>?search=<%=param%>">...</a></li>
										  	
										  	<%} %>
										  	<% if(model.getCurrentPage() != model.getTotalPage()){ %>
										  	<li><a href="<%=realPath %>/<%=model.getTotalPage()%>?search=<%=param%>"><%=model.getTotalPage() %></a></li>
										  	<%} %>
										  	<% if(model.getCurrentPage() != model.getTotalPage()) {%>
										  	<li class="next"><a href="<%=realPath %>/<%=model.getNext()%>?search=<%=param%>">»</a></li>
										  	<%} %>
										</ul>
										<%
											}
										%>
										<!-- end pager -->
										<% 
											}else{
												%>
									
									
										<%
											if(model != null){
												//PageModel model=dto.getModel();
											
										%>
										<ul class="pager">
											<% 
												if(model.getCurrentPage()!=1){
											%>
  											<li class="previous"><a href="<%=realPath %>/<%=model.getPre()%>">«</a></li>
  											<%} %>
  											<% if(model.getCurrentPage()==1) {%>
										  	<li class="active"><a href="<%=realPath %>/<%=model.getCurrentPage()%>"><%=model.getCurrentPage() %></a></li>
										  	<li><a href="<%=realPath %>/<%=model.getCurrentPage()+1%>"><%=model.getCurrentPage()+1 %></a></li>
										  	<%}else{ %>
										  	<li><a href="<%=realPath %>/<%=model.getCurrentPage()-1%>"><%=model.getCurrentPage()-1 %></a></li>
										  	<li class="active"><a href="<%=realPath %>/<%=model.getCurrentPage()%>"><%=model.getCurrentPage() %></a></li>
										  	<%} %>
										  	<% if(model.getNext()!=model.getTotalPage()){ 
										  		
										  	%>
										  	<li><a href="<%=realPath %>/<%=model.getNext()%>">...</a></li>
										  	
										  	<%} %>
										  	<% if(model.getCurrentPage() != model.getTotalPage()){ %>
										  	<li><a href="<%=realPath %>/<%=model.getTotalPage()%>"><%=model.getTotalPage() %></a></li>
										  	<%} %>
										  	<% if(model.getCurrentPage() != model.getTotalPage()) {%>
										  	<li class="next"><a href="<%=realPath %>/<%=model.getNext()%>">»</a></li>
										  	<%} %>
										</ul>
										<%
											}
										%>
										
											<% 
											}
										%>