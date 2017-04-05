<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
	<%@include file="c_header.jsp" %>
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
						<div class="panel-heading"><h5>区域</h5></div>
							<div class="panel-body">
								<div>
								    <ul class="ztree" id="dis_tree"></ul>
								</div>
								<!--start test tree 
								<div>
									<ul class="ztree" id="dis_tree2"></ul>
								</div>-->
								<!--end test tree -->
							</div>
					</div>
				</div>
				<div class="col-lg-8 col-sm-8 col-xs-12">
					<div class="panel">
						<div class="panel-heading"><h5>信息</h5></div>
							<div class="panel-body">
								<form class="form-horizontal">
								  <div class="form-group">
								    <label for="disId" class="col-sm-2">区域编号</label>
								    <div class="col-md-4 col-sm-8">
								      <input type="text" class="form-control" id="disId" placeholder="区域编号">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="longitude" class="col-sm-2">经度</label>
								    <div class="col-md-4 col-sm-8">
								      <input type="text" class="form-control" id="longitude" placeholder="经度">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="latitude" class="col-sm-2">纬度</label>
								    <div class="col-md-4 col-sm-8">
								      <input type="text" class="form-control" id="latitude" placeholder="纬度">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="disName" class="col-sm-2">区域名称</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="text" class="form-control" id="disName" placeholder="区域名称">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="parentName" class="col-sm-2">父级区域</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="text" class="form-control" id="parentName" placeholder="父级区域">
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label for="disLevel" class="col-sm-2">所属级别</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="text" class="form-control" id="disLevel" placeholder="所属级别">
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label for="disCode" class="col-sm-2">区域编码</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="text" class="form-control" id="disCode" placeholder="区域编码">
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label for="logicAddress" class="col-sm-2">逻辑地址</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="text" class="form-control" id="logicAddress" placeholder="逻辑地址">
								    </div>
								  </div>
								  
								  
								  <div class="form-group">
								    <div class="col-sm-offset-1 col-sm-10">
								      <button type="button" class="btn btn-primary" id="addChildDis" data-moveable="true" data-toggle="modal" data-target="#disModel">添加子区域</button>
								      <button type="button" class="btn btn-info">修改</button>
								      <button type="button" class="btn btn-danger">删除</button>
								    </div>
								  </div>
								</form>
							</div>
					</div>
				</div>
			</div>
			

		</div>
	</div>
	
	
<div class="modal fade" id="disModel">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
        <h4 class="modal-title" id="dis_title">标题</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        	<!-- 操作类型，1为添加，2为修改 -->
        	<input type="hidden" class="form-control" id="dis_action" >
        	<input type="hidden" class="form-control" id="dis_parentId" >
        	<div class="form-group">
				<label for="dis_name" class="col-sm-2">区域名称</label>
				<div class="col-md-6 col-sm-10">
					<input type="text" class="form-control" id="dis_name" placeholder="区域名称">
				</div>
			</div>
			
			 <div class="form-group">
				<label for="dis_longitude" class="col-sm-2">经度</label>
				<div class="col-md-4 col-sm-8">
					<input type="text" class="form-control" id="dis_longitude" placeholder="经度">
				</div>
			</div>
			<div class="form-group">
				<label for="dis_latitude" class="col-sm-2">纬度</label>
				<div class="col-md-4 col-sm-8">
					<input type="text" class="form-control" id="dis_latitude" placeholder="纬度">
				</div>
			</div>
			 <div class="form-group">
				<label for="dis_parent" class="col-sm-2">父级区域</label>
				<div class="col-md-6 col-sm-10">
					<input type="text" class="form-control" id="dis_parent" placeholder="父级区域" disabled="disabled">
				</div>
			</div>
			 <div class="form-group">
				<label for="dis_code" class="col-sm-2">区域编码</label>
				<div class="col-md-6 col-sm-10">
					<input type="text" class="form-control" id="dis_code" placeholder="区域编码">
				</div>
			</div>
								  
			<div class="form-group">
				<label for="dis_address" class="col-sm-2">逻辑地址</label>
				<div class="col-md-6 col-sm-10">
					<input type="text" class="form-control" id="dis_address" placeholder="逻辑地址">
				</div>
			</div>
			
			<div class="form-group">
				<label for="dis_remark" class="col-sm-2">备注</label>
				<div class="col-md-6 col-sm-10">
					<textarea class="form-control" rows="3" id="dis_remark" placeholder="备注信息"></textarea>
				</div>
			</div>
			
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary" id="dis_save">保存</button>
      </div>
    </div>
  </div>
</div>

<%@include file="c_tail.jsp" %>
<script type="text/javascript" src="/lib/ztree/jquery.ztree.all.min.js"></script>
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
		    /*check:{//表示tree的节点在点击时的相关设置
		        enable:true,//是否显示radio/checkbox
		        chkStyle:"radio",//值为checkbox或者radio表示
		        checkboxType:{p:"",s:""},//表示父子节点的联动效果
		        radioType:"level"//设置tree的分组
		    },*/
		    callback:{//表示tree的一些事件处理函数
		        onClick:handlerClick,
		        onCheck:handlerCheck
		    }
		}   
		/*
		  点击事件，在这里面要做，当点中事件产生时，需要将节点前面的checkbox一起选中
		 */       
		function handlerClick(event,treeId,treeNode){
			//alert(treeNode.isParent);
		   //var zTree = $.fn.zTree.getZTreeObj("dis_tree");
		   //zTree.selectNode(treeNode);
		   //zTree.checkNode(treeNode,true,true);
		   //treeNode.checked=true;
		   //alert("aaaa----click");
		   if(treeNode.isParent==false){
			   $("#addChildDis").attr({"disabled":"disabled"}); //禁用按钮
		   }else{
			   $("#addChildDis").removeAttr("disabled");//取消禁用按钮
		   }
			var parameter = {
					id:treeNode.id  
			 };  
			callHttp("/common/platform/district/qualized",parameter,function(data){
				var val=data.data;
				$("#disId").val(val.id);
				$("#longitude").val(val.longitude);
				$("#latitude").val(val.latitude);
				$("#disName").val(val.disName);
				$("#parentName").val(val.parentName);
				$("#disLevel").val(val.disLevelName);
				$("#disCode").val(val.disCode);
				$("#logicAddress").val(val.disLogicAddress);
			},function(data){});
		}
		/*
		  当点击前面的checkbox时，还需要设置选中当前节点
		 */
		function handlerCheck(event,treeId,treeNode){
			
		   var zTree = $.fn.zTree.getZTreeObj("dis_tree");
		   //zTree.selectNode(treeNode);
		   //alert("aaaa----check");
		}
		
		function initTree(treeData){
		    $.fn.zTree.init($("#dis_tree"),setting,treeData);
		    var treeObj = $.fn.zTree.getZTreeObj("dis_tree");
		    var nodes = treeObj.getNodes();//得到树的根节点信息
		    //alert(nodes.length);
		    //展开二级节点
            for (var i = 0; i < nodes.length; i++) { //设置节点展开
                treeObj.expandNode(nodes[i], true, false, true);
            }
            treeObj.selectNode(nodes[0]);
            //自动点击zTree中的第一个节点数据
            treeObj.setting.callback.onClick(null, treeObj.setting.treeId, nodes[0]);
            //选中根节点的第一个节点信息
           /* if(nodes.length >0 && nodes[0]){
            	if(nodes[0].children && nodes[0].children.length>0){
            		var childNode=nodes[0].children[0];
            		treeObj.selectNode(childNodes);
            		//treeObj.checkNode(childNode);  
            	}
            }*/
		    /*if(nodes.length >0){
		    	treeObj.selectNode(nodes[0]);  
		    }*/
		    
		}
		/**按需加载数据，即需要打开子节点时，再去加载数据**/
		var tree={
			zTree:'',  
			pNode:'',  
			setting:{  
				isSimpleData: true,  
				treeNodeKey: "id",  
				treeNodeParentKey: "pId",  
				showLine: true,  
				root:{   
				     isRoot:true,  
				     nodes:[]  
				},
				callback:{
					onExpand:function(event,treeId,treeNode){  
			               tree.pNode = treeNode;  
			               //alert("aaaaaaaaaaaaaaaaaaaa");
			               tree.loadNodeByPNode();  
			           } 
				}
			},
			
			loadRootNode:function(){
				 var zNodes=[];
			     var parameter = {  
			         pId:0  
			     };  
			     callHttp("/common/platform/district/lazy/tree",parameter,function(data){
			    	 $.each(data.data,function(i,item){
			    		  var html={id:item.id,pId:item.pId, name:item.name,isParent:item.isParent,parent:true };
			    		  zNodes[i]=html;
			    	 });
			    	 $.fn.zTree.init($("#dis_tree2"), tree.setting,zNodes);
				     tree.zTree = $.fn.zTree.getZTreeObj("dis_tree2");
			     },function(data){
			    	 
			     });
			     
			},
			loadNodeByPNode:function(){
				var children=[];
			    var folder=false;
			    var parameter= {  
			     	pId:tree.pNode.id //子节点的pcode是父节点的id  
			    };
			    //alert(parameter.pId);
			    if(!tree.zTree.getNodeByParam("pId",tree.pNode.id)){
			    	callHttp("/common/platform/district/lazy/tree",parameter,function(data){
			    		 $.each(data.data,function(i,item){
				    		  var html={id:item.id,pId:item.pId, name:item.name,isParent:item.isParent};
				    		  folder=item.isParent;
				    		  children[i]=html;
				    	 });
			    		 tree.zTree.addNodes(tree.pNode,children,folder); 
			    	},function(data){});
			    }
			}
		}
		
		function initDistrictTree(){
			var treeData;
			callHttp("/common/platform/district/tree",null,function(data){
				treeData=data.data;
				initTree(treeData);
			},function(data){
				
			});
		}
		
		$(document).ready(function(){
			initDistrictTree();
			//tree.loadRootNode(); 
			
			$('#addChildDis').click(function(){
				//alert("ddddddddd");
				$("#dis_title").html("添加子区域");
				var parentId=$("#disId").val();
				$("#dis_parentId").val(parentId);
				var parentName=$("#disName").val();
				$("#dis_parent").val(parentName);
				//$("#dis_model").html("add-child-dis:click")
				$("#dis_action").val(1);
				
				$("#dis_name").val("");
				$("#dis_code").val("");
				$("#dis_longitude").val("");
				$("#dis_latitude").val("");
				$("#dis_address").val("");
				$("#dis_remark").val("");
			});
			
			$('#dis_save').click(function(){
				var disName=$("#dis_name").val();
				if(disName==null ||disName==""){
					Modal.alert({
						 title: '错误',
						 msg: '区域名称不可为空',
						        //btnok: '确定',
						        //btncl:'取消'
					});
					/*Modal.confirm(
						    {
						        msg: "是否删除角色？"
						    })
						    .on( function (e) {
						        alert("返回结果：" + e);
						    }); */
					return;
				}
				var disCode=$("#dis_code").val();
				if(disCode == null || disCode == ""){
					Modal.alert({title:'错误',msg:'区域编码不能为空'});
					return;
				}
				var actionType=$("#dis_action").val();
				var parentId=$("#dis_parentId").val();
				var longitude=$("#dis_longitude").val();
				var latitude=$("#dis_latitude").val();
				
				var disAddress=$("#dis_address").val();
				var disRemark=$("#dis_remark").val();
				
				var parameter={
					"disName":disName,
					"disCode":disCode,
					"actionType":actionType,
					"parentId":parentId,
					"longitude":longitude,
					"latitude":latitude,
					"disAddress":disAddress,
					"disRemark":disRemark
				}
				callHttp("/common/platform/district/edit",parameter,function(data){
					Modal.alert({
						 title: '信息',
						 msg: '区域添加成功',
						        //btnok: '确定',
						        //btncl:'取消'
						
					}).on(function(){$('#disModel').modal('toggle');});
					initDistrictTree();
				},function(data){
					
				});
			});
			
			
		});
		//(function(){
			
			//initTree();
		//}());

	</script>
