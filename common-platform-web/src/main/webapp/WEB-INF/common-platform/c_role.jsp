﻿<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>z-admin</title>
	
	<link rel="stylesheet" type="text/css" href="/css/zui.css">
	<link rel="stylesheet" type="text/css" href="/css/theme/zui-theme-blue.css">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<link rel="stylesheet" type="text/css" href="/lib/ztree/metroStyle.css">

	<script type="text/javascript" src="/lib/jquery/jquery.js"></script>
	
	<script type="text/javascript" src="/lib/ztree/jquery.ztree.all.min.js"></script>
	
	<script type="text/javascript" src="/js/zui.js"></script>

</head>

<body>
<div class="main">
	<header class="header">
		<div class="header-left">
			<div class="sidebar-toggle"><i class="icon icon-bars"></i></div>
			<div class="logo">z-<span class="text-primary">admin</span></div>
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
					<a href="h_role.html">角色管理</a>
					<a href="h_modules.html">模块管理</a>
					<a href="district.html">区域管理</a>
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
					<a href="h_user.html">用户管理</a>
					
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
	<div class="main-content">
		<div class="wrapper">
			<ol class="breadcrumb">
  				<li><a href="#"><i class="icon icon-home"></i> 主页</a></li>
  				<li><a href="#">权限设置</a></li>
  				<li class="active">区域管理</li>
			</ol>
			<div class="horizontal-space"></div>
			<div class="row">
				<div class="col-lg-4 col-sm-4 col-xs-12">
					<div class="panel">
						<div class="panel-heading"><h5>角色管理</h5></div>
							<div class="panel-body">
								<div>
								    <ul class="ztree" id="des_school"></ul>
								</div>
								<button type="button" class="btn btn-info">修改</button>
								<button type="button" class="btn btn-danger">删除</button>
							</div>
					</div>
				</div>
				<div class="col-lg-8 col-sm-8 col-xs-12">
					<div class="panel">
						<div class="panel-heading"><h5>拥有权限</h5></div>
							<div class="panel-body">
								<form>
									<input type="hidden" id="roleId" name="roleId" />
									<input type="hidden" name="hasModuleIds" id="hasModuleIds" >
									<ol>
										<li  class="master_action"> <label for="module_23" ><input type="checkbox" name="module" value="23" id="module_23"/>设备管理1</label>
											<ul >
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" ">
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
											</ul>
										</li>
										<div class="horizontal-space"></div>
										<li class="master_action"> <label for="module_23" ><input type="checkbox" name="module" value="23" id="module_23"/>设备管理2</label>
											<ul>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
												<li >
													<label for="module_23" >
		                            					<input type="checkbox" name="module" value="23" id="module_23"/>设备列表
		                            				</label>
												</li>
											</ul>
										</li>
									</ol>
									<div class="horizontal-space"></div>
									<div class="form-group">
										<div class="col-sm-offset-1 col-sm-10">
											<button type="button" class="btn btn-info">更新权限</button>
										</div>
									</div>
								</form>

							</div>
					</div>
				</div>
			</div>
			

		</div>
	</div>
</div>
	<script type="text/javascript" src="/js/admin.js"></script>
	<script type="text/javascript" >
		/*$(document).ready(function(){
			var myTree = $('#r_tree').data('zui.tree');
			myTree.expand();
			//$('#r_tree').tree('expand');
		});*/
	</script>

	<script type="text/javascript">
		var setting = {
		    data:{//表示tree的数据格式
		        simpleData:{
		            enable:true,//表示使用简单数据模式
		            idKey:"id",//设置之后id为在简单数据模式中的父子节点关联的桥梁
		            pidKey:"pId",//设置之后pid为在简单数据模式中的父子节点关联的桥梁和id互相对应
		            rootId:"null"//pid为null的表示根节点
		        }
		    },
		    view:{//表示tree的显示状态
		    	dblClickExpand: true,//双击展开  
        		showLayer: false,  
		        selectMulti:false//表示禁止多选
		    },
		    check:{//表示tree的节点在点击时的相关设置
		        enable:true,//是否显示radio/checkbox
		        chkStyle:"radio",//值为checkbox或者radio表示
		        checkboxType:{p:"",s:""},//表示父子节点的联动效果
		        radioType:"level"//设置tree的分组
		    },
		    callback:{//表示tree的一些事件处理函数
		        onClick:handlerClick,
		        onCheck:handlerCheck
		    }
		}   
		/*
		  点击事件，在这里面要做，当点中事件产生时，需要将节点前面的checkbox一起选中
		 */       
		function handlerClick(event,treeId,treeNode){
		   var zTree = $.fn.zTree.getZTreeObj("des_school");
		   //zTree.selectNode(treeNode);
		   zTree.checkNode(treeNode,true,true);
		   //treeNode.checked=true;
		   alert("aaaa----click");
		}
		/*
		  当点击前面的checkbox时，还需要设置选中当前节点
		 */
		function handlerCheck(event,treeId,treeNode){
		   var zTree = $.fn.zTree.getZTreeObj("des_school");
		   zTree.selectNode(treeNode);
		   alert("aaaa----check");
		}
		var data = {
		    teacher:[
		        {id:0,name:"张老师",sex:"男"},
		        {id:1,name:"李老师",sex:"男"},
		        {id:2,name:"王老师",sex:"女"}
		    ],
		    nodes:[
		        {id:0,name:"角色1"},
				{id:1,name:"角色2"},
				{id:2,name:"角色3"},
				{id:3,name:"角色4"},
				{id:4,name:"角色5"}
		    ]
		}
		var nodes2=[
			{id:0,name:"角色1"},
			{id:1,name:"角色2"},
			{id:2,name:"角色3"},
			{id:3,name:"角色4"},
			{id:4,name:"角色5"}
		];
		function initTree(){
			//alert(nodes2.length);
		    //var teacherList = data.teacher;
		    //var studentList = data.nodes;
		    var treeData = [];
		    treeData.push({id:"root",name:"所有角色",pId:null});
		    for(var i=0,il=nodes2.length;i<il;i++){
		        nodes2[i].pId = "root";
		        treeData.push(nodes2[i]);
		    }
		    /*for(var i=0,il=studentList.length;i<il;i++){
		　　　　 studentList[i].id = "s"+studentList[i].id;
		        studentList[i].pId = studentList[i].tId;
		        treeData.push(studentList[i]);
		    }*/
		    $.fn.zTree.init($("#des_school"),setting,treeData);

		    var treeObj = $.fn.zTree.getZTreeObj("des_school");
		    var nodes = treeObj.getNodes();//得到树的根节点信息
		    //alert(nodes.length);
		    //展开二级节点
            for (var i = 0; i < nodes.length; i++) { //设置节点展开
                treeObj.expandNode(nodes[i], true, false, true);
            }
            //选中根节点的第一个节点信息
            if(nodes.length >0 && nodes[0]){
            	if(nodes[0].children.length>0){
            		var childNode=nodes[0].children[0];
            		treeObj.selectNode(childNode);
            		treeObj.checkNode(childNode);  
            	}
            }
		    /*if(nodes.length >0){
		    	treeObj.selectNode(nodes[0]);  
		    }*/
		    
		}
		$(function(){
		　　initTree();
		})

	</script>
	
</body>
</html>