<%@page import="java.text.SimpleDateFormat,com.common.platform.utils.dto.PageDto,com.common.platform.utils.dto.PageModel,com.common.platform.model.TblStaff,java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

	<%@include file="c_header.jsp" %>

	<div class="main-content">
		<div class="wrapper">
			<ol class="breadcrumb">
  				<li><a href="#"><i class="icon icon-home"></i> 主页</a></li>
  				<li><a href="#">基础数据</a></li>
  				<li class="active">用户管理</li>
			</ol>
			<div class="horizontal-space"></div>
			<div class="panel">
				<div class="panel-heading"><h5>用户管理</h5></div>
				<div class="panel-body">
					<div class="pull-right"><button class="btn btn-primary"><i class="icon icon-plus"></i>新增</button></div>
					<form action="#" method="post">
						<div class="search">
   							搜索：
   							<%
											String searchParam=(String)request.getAttribute("search");
											if(searchParam != null){
												%>
   								<input type="text" id="topic" class="text" name="topic" placeholder="搜索" style="width:150px;" value="<%=searchParam%>">
   								<%} else{%>
   									<input type="text" id="topic" class="text" name="topic" placeholder="搜索" style="width:150px;">
   								<%} %>
   								<!-- 
   							&nbsp;搜索分类：
   								<div class="btn-group btn-dropdown">
   									<button type="button" class="btn btn-default dropdown-toggle btn-sm" data-toggle="dropdown">
   										<span class="drop-topic">请选择类别</span> <span class="caret"></span>
   									</button>
   									<ul class="dropdown-menu">
   										<li><a href="#">请选择类别</a></li>
   										<li class="divider"></li>
   										<li><a href="#">分类一</a></li>
   										<li><a href="#">分类二</a></li>
   									</ul>
   								</div>   
   							&nbsp;是否启用：
   								<div class="btn-group btn-dropdown">
   									<button type="button" class="btn btn-default dropdown-toggle btn-sm" data-toggle="dropdown">
   										<span class="drop-topic">请选择</span> <span class="caret"></span>
   									</button>
   									<ul class="dropdown-menu">
   										<li><a href="#">请选择</a></li>
   										<li class="divider"></li>
   										<li><a href="#">启用</a></li>
   										<li><a href="#">禁用</a></li>
   									</ul>
   								</div> -->
   							&nbsp;<button type="button" id="userSearch" value="查询" class="btn btn-primary-outline btn-xs"><i class="icon-search"></i>&nbsp;查询</button>  
   						</div>
					</form>

					<table class="table table-bordered table-hover table-striped">
				        <thead>
				          	<tr>
				          		
					            <th width="50" class="text-center">编号</th>
					            <th width="100" class="text-center">用户名</th>
					            <th width="100" class="text-center">密码</th>
					            <th width="200" class="text-center">创建时间</th>
					            <th width="250" class="text-center">备注</th>
					            <th width="140" class="text-center">操作</th>
				          	</tr>
				        </thead>
				        <tbody>
				        	<%
				        		PageDto<TblStaff> dto=(PageDto<TblStaff>)request.getAttribute("staff");
				        		if(dto != null){
				        			List<TblStaff> staffs=dto.getData();
				        			if(staffs != null && staffs.size()>0){
				        				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				        				for(int i=0;i<staffs.size();i++){
				        					TblStaff s=staffs.get(i);
				        	%>
				        				
					          	<tr>
						            <td class="text-center"><%=s.getId() %></td>
						            <td><%=s.getUsername() %></td>
						            <td class="text-center"><%=s.getUserpassword() %></td>
						            <td class="text-center">
										<%=sdf.format(s.getCreateDate()) %>
						            </td>
						            <td class="text-center"><%= s.getRemark()==null?"":s.getRemark() %></td>
						            <td class="text-center">
										<button type="button" class="btn btn-sm btn-success"><i class="icon-edit"></i> 编辑</button>
										<button type="button" class="btn btn-sm btn-danger"><i class="icon-trash"></i> 删除</button>
						            </td>
					          	</tr>
				          	<%
				        				}
				        	%>
				          	<% 
				        			}
				        	%>
				          	<% 
				        		}
				        	%>
				        </tbody>
				        <tfoot>
							<tr>
					            <th colspan="8">
									<div class="pull-right">
										<%@include file="c_pager.jsp" %>
									</div>
					            </th>
				          	</tr>
				        </tfoot>
				    </table>
			</div>
	</div>
	
	
<%@include file="c_tail.jsp" %>

<script type="text/javascript">
		function userSearchBtnClick(){
			var topic=$("#topic").val();
			if(topic == "" || topic==null){
				window.location.href="common/platform/user/1";
			}else{
				window.location.href="common/platform/user/1?search="+topic;
			}
			
		}
		$(document).ready(function(){
			$("#userSearch").click(function(){
				userSearchBtnClick();
			});
		});
	</script>