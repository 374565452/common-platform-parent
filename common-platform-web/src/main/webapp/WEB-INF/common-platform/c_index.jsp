<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@include file="c_header.jsp"%>
	<div class="main-content">
		<div class="wrapper">
			<ol class="breadcrumb">
  				<li><a href="#"><i class="icon icon-home"></i> 主页</a></li>
  				<!--<li><a href="#">栏目管理</a></li>
  				<li class="active">栏目列表</li>-->
			</ol>
			<div class="horizontal-space"></div>
			<div class="panel">
				<div class="panel-heading"><h5>信息管理栏</h5></div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6 col-sm-6 col-xs-12">
							<ul class="nav nav-tabs">
							  <li class="active"><a data-tab href="#tabContent1">标签1</a></li>
							  <li><a data-tab href="#tabContent2">标签2</a></li>
							  <li><a data-tab href="#tabContent3">标签3</a></li>
							</ul>
							<div class="tab-content">
							  <div class="tab-pane active" id="tabContent1">
							    <p>我是标签1。</p>
							  </div>
							  <div class="tab-pane" id="tabContent2">
							    <p>标签2的内容。</p>
							  </div>
							  <div class="tab-pane" id="tabContent3">
							    <p>这是标签3的内容。</p>
							  </div>
						  </div>
						</div>

						<div class="col-lg-6 col-sm-6 col-xs-12">
						  	<div class="panel-group" id="accordionPanels" aria-multiselectable="true">
							  <div class="panel panel-default">
							    <div class="panel-heading" id="headingOne">
							      <h4 class="panel-title">
							        <a data-toggle="collapse" data-parent="#accordionPanels" href="#collapseOne">
							          折叠面板 1
							        </a>
							      </h4>
							    </div>
							    <div id="collapseOne" class="panel-collapse collapse in">
							      <div class="panel-body">折叠面板内容 1</div>
							    </div>
							  </div>
							  <div class="panel panel-default">
							    <div class="panel-heading" id="headingTwo">
							      <h4 class="panel-title">
							        <a class="collapsed" data-toggle="collapse" data-parent="#accordionPanels" href="#collapseTwo">
							          折叠面板 2
							        </a>
							      </h4>
							    </div>
							    <div id="collapseTwo" class="panel-collapse collapse">
							      <div class="panel-body">折叠面板内容 2</div>
							    </div>
							  </div>
							  <div class="panel panel-default">
							    <div class="panel-heading" id="headingThree">
							      <h4 class="panel-title">
							        <a class="collapsed" data-toggle="collapse" data-parent="#accordionPanels" href="#collapseThree">
							          折叠面板 3
							        </a>
							      </h4>
							    </div>
							    <div id="collapseThree" class="panel-collapse collapse">
							      <div class="panel-body">折叠面板内容 3</div>
							    </div>
							  </div>
							</div>
						</div>

					</div>
				</div>
			 </div>


			 <div class="panel">
				<div class="panel-heading"><h5>日志管理类</h5></div>
				<div class="panel-body">
					<div class="row">
					  <div class="col-xs-3">
					    <ul class="nav nav-tabs nav-stacked">
					      <li class="active"><a href="###" data-target="#tab3Content1" data-toggle="tab">标签1</a></li>
					      <li><a href="###" data-target="#tab3Content2" data-toggle="tab">标签2</a></li>
					      <li><a href="###" data-target="#tab3Content3" data-toggle="tab">标签3</a></li>
					    </ul>
					  </div>
					  <div class="col-xs-9">
					    <div class="tab-content col-xs-9">
					      <div class="tab-pane fade active in" id="tab3Content1">
					        <p>我是标签1。</p>
					      </div>
					      <div class="tab-pane fade" id="tab3Content2">
					        <p>标签2的内容。</p>
					      </div>
					      <div class="tab-pane fade" id="tab3Content3">
					        <p>这是标签3的内容。</p>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
			 </div>

		</div>
	</div>
<%@include file="c_tail.jsp"%>