<%@page import="com.common.platform.utils.dto.MenuInfo,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
	
	<%@include file="c_header.jsp" %>
	
	<div class="main-content">
		<div class="wrapper">
			<ol class="breadcrumb">
  				<li><a href="#"><i class="icon icon-home"></i> 主页</a></li>
  				<li><a href="#">权限设置</a></li>
  				<li class="active">角色管理</li>
			</ol>
			<div class="horizontal-space"></div>
			<div class="row">
				<div class="col-lg-4 col-sm-4 col-xs-12">
					<div class="panel">
						<div class="panel-heading"><h5>角色管理</h5></div>
							<div class="panel-body">
								<div>
								    <ul class="ztree" id="t_role"></ul>
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
									<!--  
										<li  class="master_action"> <label for="module_23" ><input type="checkbox" name="module" value="23" id="module_23"/>设备管理1</label>
											<ul >
												<li>
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
										-->
										
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
<%@include file="c_tail.jsp" %>
	<script type="text/javascript" >
		/*$(document).ready(function(){
			var myTree = $('#r_tree').data('zui.tree');
			myTree.expand();
			//$('#r_tree').tree('expand');
		});*/
	</script>
<script type="text/javascript" src="lib/ztree/jquery.ztree.all.min.js"></script>
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
		   /*  check:{//表示tree的节点在点击时的相关设置
		        enable:true,//是否显示radio/checkbox
		        chkStyle:"radio",//值为checkbox或者radio表示
		        checkboxType:{p:"",s:""},//表示父子节点的联动效果
		        radioType:"level"//设置tree的分组
		    }, */
		    callback:{//表示tree的一些事件处理函数
		        onClick:handlerClick,
		        onCheck:handlerCheck
		    }
		}   
		function initAuthDom(menuInfos){
			var divid='<div class="horizontal-space"></div>';
			var li_1='<li class="master_action"> <label for="';
			var li_2='" ><input type="checkbox" name="module" value=" ';
			var li_3='" id="';
			var li_4='"/>';
			var li_5='</label>';
			
			var c_0='<ul>';
			var c_1='<li ><label for="';
			var c_2='</li>'
			var c_3='</ul>';
			var li_6='</li>';
			var html ="";
			$.each(menuInfos,function(i,menu){
				html+= li_1;
				html+= menu.id;
				html+=li_2;
				html+=menu.id;
				html+=li_3;
				html+=menu.id;
				html+=li_4 + menu.menuName;
				html+= li_5;
				if(menu.children!=null){
					html+=c_0;
					$.each(menu.children,function(j,c){
						html+=c_1+c.id+li_2+c.id+li_3+c.id+li_4+c.menuName+li_5+c_2;
					});
					html+=c_3;
				}
				html+=li_6;
				if((i+1) != menuInfos.length){
					html+=divid;
				}
			});
			console.log(html);
			$("div.panel-body form ol").append(html);
		}
		function getAuthInfo(treeNode){
			var roleId=treeNode.id;
			callHttp("common/platform/role/auth/"+roleId,null,function(data){
				var menuInfos=data.data;
				initAuthDom(menuInfos);
			},function(data){
				
			});
		}
		
		/*
		  点击事件，在这里面要做，当点中事件产生时，需要将节点前面的checkbox一起选中
		 */       
		function handlerClick(event,treeId,treeNode){
		   //var zTree = $.fn.zTree.getZTreeObj("t_role");
		   //zTree.selectNode(treeNode);
		   //zTree.checkNode(treeNode,true,true);
		   //treeNode.checked=true;
		   //alert("aaaa----click");
		   //需要初始化权限列表
		   //alert($(".sidebar .item.vertical > a"));
			getAuthInfo(treeNode);
		}
		/*
		  当点击前面的checkbox时，还需要设置选中当前节点
		 */
		function handlerCheck(event,treeId,treeNode){
		   var zTree = $.fn.zTree.getZTreeObj("t_role");
		   zTree.selectNode(treeNode);
		   alert("aaaa----check");
		}
		
		function initTree(treeData){
		    $.fn.zTree.init($("#t_role"),setting,treeData);

		    var treeObj = $.fn.zTree.getZTreeObj("t_role");
		    var nodes = treeObj.getNodes();//得到树的根节点信息
		    //alert(nodes.length);
		    //展开二级节点
            for (var i = 0; i < nodes.length; i++) { //设置节点展开
                treeObj.expandNode(nodes[i], true, false, true);
            }
		    if(nodes[0].children.length>0){
		    	treeObj.selectNode(nodes[0].children[0]);
		    	 treeObj.setting.callback.onClick(null, treeObj.setting.treeId, nodes[0].children[0]);
		    }
		    //默认点击子节点中的第一个节点数据
           /*  //选中根节点的第一个节点信息
            if(nodes.length >0 && nodes[0]){
            	if(nodes[0].children.length>0){
            		var childNode=nodes[0].children[0];
            		treeObj.selectNode(childNode);
            		treeObj.checkNode(childNode);  
            	}
            } */
		    /*if(nodes.length >0){
		    	treeObj.selectNode(nodes[0]);  
		    }*/
		    
		}
		
		function initRoleTree(){
			var treeData;
			callHttp("common/platform/role/all",null,function(data){
				treeData=data.data;
				initTree(treeData);
			},function(data){
				
			});
		}
		
		(function(){
			initRoleTree();
		}());

	</script>
