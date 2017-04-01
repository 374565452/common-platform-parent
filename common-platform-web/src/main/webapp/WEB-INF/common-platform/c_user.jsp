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
					<div class="pull-right"><button class="btn btn-primary">添加栏目</button></div>
					<form action="#" method="post">
						<div class="search">
   							搜索名称：
   								<input type="text" class="text" name="topic" placeholder="搜索名称" style="width:150px;">
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
   								</div>
   							&nbsp;<button type="submit" value="查询" class="btn btn-primary-outline btn-xs"><i class="icon-search"></i>&nbsp;查询</button>  
   						</div>
					</form>

					<table class="table table-bordered table-hover table-striped">
				        <thead>
				          	<tr>
				          		
					            <th width="50" class="text-center">ID</th>
					            <th>栏目名称</th>
					            <th width="200" class="text-center">上级栏目</th>
					            <th width="100" class="text-center">是否启用</th>
					            <th width="150" class="text-center">更新日期</th>
					            <th width="140" class="text-center">操作</th>
				          	</tr>
				        </thead>
				        <tbody>
				          	<tr>
					          	
					            <td class="text-center">1</td>
					            <td>这是栏目名称</td>
					            <td class="text-center">--</td>
					            <td class="text-center">
									<div class="btn-group">
          								<button type="button" class="btn btn-xs btn-primary">启用</button>
          								<button type="button" class="btn btn-xs">禁用</button>
        							</div>
					            </td>
					            <td class="text-center">2016-06-05 16:20</td>
					            <td class="text-center">
									<button type="button" class="btn btn-sm btn-success"><i class="icon-edit"></i> 编辑</button>
									<button type="button" class="btn btn-sm btn-danger"><i class="icon-trash"></i> 删除</button>
					            </td>
				          	</tr>
				          	<tr>
					          	
					            <td class="text-center">1</td>
					            <td>这是栏目名称</td>
					            <td class="text-center">--</td>
					            <td class="text-center">
									<div class="btn-group">
          								<button type="button" class="btn btn-xs btn-primary">启用</button>
          								<button type="button" class="btn btn-xs">禁用</button>
        							</div>
					            </td>
					            <td class="text-center">2016-06-05 16:20</td>
					            <td class="text-center">
									<button type="button" class="btn btn-sm btn-success"><i class="icon-edit"></i> 编辑</button>
									<button type="button" class="btn btn-sm btn-danger"><i class="icon-trash"></i> 删除</button>
					            </td>
				          	</tr>
				          	<tr>
					          	
					            <td class="text-center">1</td>
					            <td>这是栏目名称</td>
					            <td class="text-center">--</td>
					            <td class="text-center">
									<div class="btn-group">
          								<button type="button" class="btn btn-xs btn-primary">启用</button>
          								<button type="button" class="btn btn-xs">禁用</button>
        							</div>
					            </td>
					            <td class="text-center">2016-06-05 16:20</td>
					            <td class="text-center">
									<button type="button" class="btn btn-sm btn-success"><i class="icon-edit"></i> 编辑</button>
									<button type="button" class="btn btn-sm btn-danger"><i class="icon-trash"></i> 删除</button>
					            </td>
				          	</tr>
				        </tbody>
				        <tfoot>
							<tr>
				          		
					            <th colspan="8">
									
									<div class="pull-right">
										<ul class="pager">
  											<li class="previous"><a href="#">«</a></li>
										  	<li><a href="#">1</a></li>
										  	<li class="active"><a href="#">2</a></li>
										  	<li><a href="#">3</a></li>
										  	<li><a href="#">...</a></li>
										  	<li><a href="#">10</a></li>
										  	<li class="next"><a href="#">»</a></li>
										</ul>
									</div>
					            </th>
				          	</tr>
				        </tfoot>
				    </table>
			</div>
	</div>
<%@include file="c_tail.jsp" %>