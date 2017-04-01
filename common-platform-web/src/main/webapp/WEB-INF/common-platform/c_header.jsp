<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>common-platform</title>
	<link rel="stylesheet" type="text/css" href="/css/zui.css">
	<link rel="stylesheet" type="text/css" href="/css/theme/zui-theme-blue.css">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<link rel="stylesheet" type="text/css" href="/lib/ztree/metroStyle.css">
	
</head>

<body>
<div class="main">
	<header class="header">
		<div class="header-left">
			<div class="sidebar-toggle"><i class="icon icon-bars"></i></div>
			<div class="logo">C-<span class="text-primary">platform</span></div>
		</div>
		<div class="header-search navbar-menu">
			 <ul >
                <li class="navbar-menu-active">
                    <a href="#">设置1</a>
                </li>
                <li>
                    <a href="#">设置2</a>
                </li>
                <li>
                    <a href="#">设置13</a>
                </li>
            </ul>
		</div>
		<div class="header-user">
			<div class="item dropdown">
				<span class="badge label label-dot label-danger"></span>
				<i class="icon icon-comments"></i>
			</div>
			<div class="item dropdown">
				<span class="badge label label-dot label-warning"></span>
				<i class="icon icon-bell-alt"></i>
			</div>
			<div class="item dropdown">
				<span data-toggle="dropdown">
					<i class="icon icon-user"></i>
					<span>管理员</span>
					<span class="caret"></span>
				</span>
				<ul class="dropdown-menu pull-right">
      				<li>
			            <a href="#">修改头像</a>
			          </li>
		          	<li>
		            	<a href="#">修改资料</a>
		          	</li>
          <li class="divider"></li>
          <li>
            <a href="#">注销</a>
          </li>
        </ul>
			</div>
		</div>
	</header>
	<aside class="sidebar">
		<div class="sidebar-menu">
			<div class="item">
				<a href="#">
					<i class="icon icon-dashboard"></i>
					<span>主页</span>
				</a>
			</div>
			<div class="item vertical">
				<a href="#">
					<i class="icon icon-key"></i>
					<span>权限设置</span>
					<span class="arrow"></span>
				</a>
				<div class="vertical-menu">
					<a href="/common/platform/c_role">角色管理</a>
					<a href="/common/platform/c_modules">模块管理</a>
					<a href="/common/platform/c_district">区域管理</a>
				</div>
			</div>
			<div class="item vertical">
				<a href="#">
					<i class="icon icon-cogs"></i>
					<span>基础数据</span>
					<span class="arrow"></span>
				</a>
				<div class="vertical-menu">
					<a href="#">参数配置</a>
					<a href="/common/platform/c_user">用户管理</a>
					
				</div>
			</div>
			<div class="item">
				<a href="#">
					<i class="icon icon-dashboard"></i>
					<span>其他信息</span>
				</a>
			</div>
			
			
		</div>
	</aside>