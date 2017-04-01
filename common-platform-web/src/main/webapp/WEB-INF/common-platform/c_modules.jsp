<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>z-admin</title>
	<link rel="stylesheet" type="text/css" href="css/zui.css">
	<link rel="stylesheet" type="text/css" href="css/theme/zui-theme-blue.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="lib/ztree/metroStyle.css">

	<script type="text/javascript" src="lib/jquery/jquery.js"></script>

	<script type="text/javascript" src="lib/ztree/jquery.ztree.all.min.js"></script>

	<script type="text/javascript" src="js/zui.js"></script>
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
                    <a href="#">è®¾ç½®1</a>
                </li>
                <li>
                    <a href="#">è®¾ç½®2</a>
                </li>
                <li>
                    <a href="#">è®¾ç½®13</a>
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
					<span>ç®¡çå</span>
					<span class="caret"></span>
				</span>
				<ul class="dropdown-menu pull-right">
      				<li>
			            <a href="#">ä¿®æ¹å¤´å</a>
			          </li>
		          	<li>
		            	<a href="#">ä¿®æ¹èµæ</a>
		          	</li>
          <li class="divider"></li>
          <li>
            <a href="#">æ³¨é</a>
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
					<span>ä¸»é¡µ</span>
				</a>
			</div>
			<div class="item vertical">
				<a href="#">
					<i class="icon icon-key"></i>
					<span>æéè®¾ç½®</span>
					<span class="arrow"></span>
				</a>
				<div class="vertical-menu">
					<a href="h_role.html">è§è²ç®¡ç</a>
					<a href="#">æ¨¡åç®¡ç</a>
					<a href="district.html">åºåç®¡ç</a>
				</div>
			</div>
			<div class="item vertical">
				<a href="#">
					<i class="icon icon-cogs"></i>
					<span>åºç¡æ°æ®</span>
					<span class="arrow"></span>
				</a>
				<div class="vertical-menu">
					<a href="#">åæ°éç½®</a>
					<a href="h_user.html">ç¨æ·ç®¡ç</a>
					
				</div>
			</div>
			<div class="item">
				<a href="#">
					<i class="icon icon-dashboard"></i>
					<span>å¶ä»ä¿¡æ¯</span>
				</a>
			</div>
			
			
		</div>
	</aside>
	<div class="main-content">
		<div class="wrapper">
			<ol class="breadcrumb">
  				<li><a href="#"><i class="icon icon-home"></i> ä¸»é¡µ</a></li>
  				<li><a href="#">æéè®¾ç½®</a></li>
  				<li class="active">åºåç®¡ç</li>
			</ol>
			<div class="horizontal-space"></div>
			<div class="row">
				<div class="col-lg-4 col-sm-4 col-xs-12">
					<div class="panel">
						<div class="panel-heading"><h5>åºå</h5></div>
							<div class="panel-body">
								<div>
								    <ul class="ztree" id="dis_tree"></ul>
								</div>
							</div>
					</div>
				</div>
				<div class="col-lg-8 col-sm-8 col-xs-12">
					<div class="panel">
						<div class="panel-heading"><h5>ä¿¡æ¯</h5></div>
							<div class="panel-body">
								<form class="form-horizontal">
								  <div class="form-group">
								    <label for="exampleInputAccount4" class="col-sm-2">åºååç§°</label>
								    <div class="col-md-4 col-sm-8">
								      <input type="text" class="form-control" id="exampleInputAccount4" placeholder="åºååç§°">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="exampleInputPassword4" class="col-sm-2">åºåID</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="password" class="form-control" id="exampleInputPassword4" placeholder="åºåID">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="exampleInputPassword4" class="col-sm-2">åºåID</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="password" class="form-control" id="exampleInputPassword4" placeholder="åºåID">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="exampleInputPassword4" class="col-sm-2">åºåID</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="password" class="form-control" id="exampleInputPassword4" placeholder="åºåID">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="exampleInputPassword4" class="col-sm-2">åºåID</label>
								    <div class="col-md-6 col-sm-10">
								      <input type="password" class="form-control" id="exampleInputPassword4" placeholder="åºåID">
								    </div>
								  </div>

								  <div class="form-group">
								    <div class="col-sm-offset-1 col-sm-10">
								      <button type="button" class="btn btn-primary">æ·»å å­åºå</button>
								      <button type="button" class="btn btn-info">ä¿®æ¹</button>
								      <button type="button" class="btn btn-danger">å é¤</button>
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
	<script type="text/javascript" src="js/admin.js"></script>

	<script type="text/javascript">
		var setting = {
		    data:{//è¡¨ç¤ºtreeçæ°æ®æ ¼å¼
		        simpleData:{
		            enable:true,//è¡¨ç¤ºä½¿ç¨ç®åæ°æ®æ¨¡å¼
		            idKey:"id",//è®¾ç½®ä¹åidä¸ºå¨ç®åæ°æ®æ¨¡å¼ä¸­çç¶å­èç¹å³èçæ¡¥æ¢
		            pidKey:"pId",//è®¾ç½®ä¹åpidä¸ºå¨ç®åæ°æ®æ¨¡å¼ä¸­çç¶å­èç¹å³èçæ¡¥æ¢åidäºç¸å¯¹åº
		            rootId:"null"//pidä¸ºnullçè¡¨ç¤ºæ ¹èç¹
		        }
		    },
		    view:{//è¡¨ç¤ºtreeçæ¾ç¤ºç¶æ
		    	dblClickExpand: true,//åå»å±å¼  
        		showLayer: false,  
		        selectMulti:false//è¡¨ç¤ºç¦æ­¢å¤é
		    },
		    check:{//è¡¨ç¤ºtreeçèç¹å¨ç¹å»æ¶çç¸å³è®¾ç½®
		        enable:true,//æ¯å¦æ¾ç¤ºradio/checkbox
		        chkStyle:"radio",//å¼ä¸ºcheckboxæèradioè¡¨ç¤º
		        checkboxType:{p:"",s:""},//è¡¨ç¤ºç¶å­èç¹çèå¨ææ
		        radioType:"level"//è®¾ç½®treeçåç»
		    },
		    callback:{//è¡¨ç¤ºtreeçä¸äºäºä»¶å¤çå½æ°
		        onClick:handlerClick,
		        onCheck:handlerCheck
		    }
		}   
		/*
		  ç¹å»äºä»¶ï¼å¨è¿éé¢è¦åï¼å½ç¹ä¸­äºä»¶äº§çæ¶ï¼éè¦å°èç¹åé¢çcheckboxä¸èµ·éä¸­
		 */       
		function handlerClick(event,treeId,treeNode){
		   var zTree = $.fn.zTree.getZTreeObj("dis_tree");
		   //zTree.selectNode(treeNode);
		   zTree.checkNode(treeNode,true,true);
		   //treeNode.checked=true;
		   //alert("aaaa----click");
		}
		/*
		  å½ç¹å»åé¢çcheckboxæ¶ï¼è¿éè¦è®¾ç½®éä¸­å½åèç¹
		 */
		function handlerCheck(event,treeId,treeNode){
		   var zTree = $.fn.zTree.getZTreeObj("dis_tree");
		   zTree.selectNode(treeNode);
		   //alert("aaaa----check");
		}
		var data = {
		    teacher:[
		        {id:0,name:"å¼ èå¸",sex:"ç·"},
		        {id:1,name:"æèå¸",sex:"ç·"},
		        {id:2,name:"çèå¸",sex:"å¥³"}
		    ],
		    nodes:[
		        {id:0,name:"è§è²1"},
				{id:1,name:"è§è²2"},
				{id:2,name:"è§è²3"},
				{id:3,name:"è§è²4"},
				{id:4,name:"è§è²5"}
		    ]
		}
		var nodes2=[
			{id:0,name:"è§è²1"},
			{id:1,name:"è§è²2"},
			{id:2,name:"è§è²3"},
			{id:3,name:"è§è²4"},
			{id:4,name:"è§è²5"}
		];
		function initTree(){
			//alert(nodes2.length);
		    //var teacherList = data.teacher;
		    //var studentList = data.nodes;
		    var treeData = [];
		    treeData.push({id:"root",name:"ææè§è²",pId:null});
		    for(var i=0,il=nodes2.length;i<il;i++){
		        nodes2[i].pId = "root";
		        treeData.push(nodes2[i]);
		    }
		    /*for(var i=0,il=studentList.length;i<il;i++){
		ãããã studentList[i].id = "s"+studentList[i].id;
		        studentList[i].pId = studentList[i].tId;
		        treeData.push(studentList[i]);
		    }*/
		    $.fn.zTree.init($("#dis_tree"),setting,treeData);

		    var treeObj = $.fn.zTree.getZTreeObj("dis_tree");
		    var nodes = treeObj.getNodes();//å¾å°æ çæ ¹èç¹ä¿¡æ¯
		    //alert(nodes.length);
		    //å±å¼äºçº§èç¹
            for (var i = 0; i < nodes.length; i++) { //è®¾ç½®èç¹å±å¼
                treeObj.expandNode(nodes[i], true, false, true);
            }
            //éä¸­æ ¹èç¹çç¬¬ä¸ä¸ªèç¹ä¿¡æ¯
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
		ããinitTree();
		})

	</script>

</body>
</html>