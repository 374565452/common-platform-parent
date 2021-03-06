<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String w_path = request.getContextPath();
	String w_basePath = request.getServerName() + ":" + request.getServerPort() + w_path + "/";
	String sock_basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ w_path + "/";
%>
	
</div>

   <!-- system modal start -->
        <div id="ycf-alert" class="modal">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h5 class="modal-title"><i class="fa fa-exclamation-circle"></i> [Title]</h5>
                    </div>
                    <div class="modal-body small">
                        <p>[Message]</p>
                    </div>
                    <div class="modal-footer" >
                        <button type="button" class="btn btn-primary ok" data-dismiss="modal">[BtnOk]</button>
                        <button type="button" class="btn btn-default cancel" data-dismiss="modal">[BtnCancel]</button>
                    </div>
                </div>
            </div>
        </div>
    <!-- system modal end -->

	<script type="text/javascript" src="lib/jquery/jquery.js"></script>
	<script type="text/javascript" src="js/zui.js"></script>
	<script type="text/javascript" src="js/side_menu.js"></script>
	
	<script type="text/javascript" src="js/admin.js"></script>
	<script type="text/javascript">
	function m_dialog(){
		window.Modal = function () {
	        var reg = new RegExp("\\[([^\\[\\]]*?)\\]", 'igm');
	        var alr = $("#ycf-alert");
	        var ahtml = alr.html();

	        //关闭时恢复 modal html 原样，供下次调用时 replace 用
	        //var _init = function () {
	        //    alr.on("hidden.bs.modal", function (e) {
	        //        $(this).html(ahtml);
	        //    });
	        //}();

	        /* html 复原不在 _init() 里面做了，重复调用时会有问题，直接在 _alert/_confirm 里面做 */


	        var _alert = function (options) {
	            alr.html(ahtml);    // 复原
	            alr.find('.ok').removeClass('btn-success').addClass('btn-primary');
	            alr.find('.cancel').hide();
	            _dialog(options);

	            return {
	                on: function (callback) {
	                    if (callback && callback instanceof Function) {
	                        alr.find('.ok').click(function () { callback(true) });
	                    }
	                }
	            };
	        };

	        var _confirm = function (options) {
	            alr.html(ahtml); // 复原
	            alr.find('.ok').removeClass('btn-primary').addClass('btn-success');
	            alr.find('.cancel').show();
	            _dialog(options);

	            return {
	                on: function (callback) {
	                    if (callback && callback instanceof Function) {
	                        alr.find('.ok').click(function () { callback(true) });
	                        alr.find('.cancel').click(function () { callback(false) });
	                    }
	                }
	            };
	        };

	        var _dialog = function (options) {
	            var ops = {
	                msg: "提示内容",
	                title: "操作提示",
	                btnok: "确定",
	                btncl: "取消"
	            };

	            $.extend(ops, options);

	            console.log(alr);

	            var html = alr.html().replace(reg, function (node, key) {
	                return {
	                    Title: ops.title,
	                    Message: ops.msg,
	                    BtnOk: ops.btnok,
	                    BtnCancel: ops.btncl
	                }[key];
	            });
	            
	            alr.html(html);
	            alr.modal({
	                width: 500,
	                backdrop: 'static'
	            });
	        }

	        return {
	            alert: _alert,
	            confirm: _confirm
	        }

	    }();
	}
	
	function initMenu(){
		callHttp("common/platform/module/menu",null,function(data){
			var menus=data.data;
			var menu_1='<div class="item"><a href="';
			var menu_title='<div class="item vertical"><a href="';
			var menu_tip1='"><i class=" ';
			var menu_tip2='"></i><span>';
			
			var menu_ch1='<span class="arrow"></span>';
			var menu_ch2='<div class="vertical-menu">';
			var menu_tail='</div>';
			var html="";
			$.each(menus,function(i,menu){
				if(menu.children != null){
					html += menu_title;
				}else{
					html+=menu_1;
				}
				html += menu.url;
				html += menu_tip1;
				html += menu.icon;
				html += menu_tip2;
				html += menu.menuName+"</span>";
				if(menu.children != null){
					html+= menu_ch1;
					html += "</a>";
					html += menu_ch2;
					$.each(menu.children,function(j,child){
						html+='<a href='+child.url+'>'+child.menuName+'</a>'
					});
					html += "</div>"
				}else{
					html += "</a>";
				}
				html += menu_tail;
			});
			//console.log(html);
			$(".sidebar-menu").append(html);
			
			//alert($(".sidebar .item.vertical > a"));
			 //responsiveView();
	        //$(window).on('resize', responsiveView);
			
		},function(data){
			
		});
	}
	
	var websocket;
	function connect() {
		var url='<%=w_basePath%>';
		var sockUrl='<%=sock_basePath%>';
		if ('WebSocket' in window) {
			alert("WebSocket");
			websocket = new WebSocket("ws://" + url + "websocket");
		} else if ('MozWebSocket' in window) {
			alert("MozWebSocket")
			websocket = new MozWebSocket("ws://" + url + "websocket");
		} else {
			alert("SockJs")
			websocket = new SockJS(sockUrl + "sockjs/websocket");
		}
	//alert(url +"====="+sockUrl);
		websocket.onopen = function(evnt) {
			//alert("connected to the server-----")
		};
		websocket.onmessage = function(evnt) {
			//$("#webSocketResult").val(
					//"(<font color='red'>" + evnt.data + "</font>)")
			Modal.alert({
				 title: '信息',
				 msg: evnt.data,
				        //btnok: '确定',
				        //btncl:'取消'
			});	
			websocketSend('hello world !');
		};
		websocket.onerror = function(evnt) {
		};
		websocket.onclose = function(evnt) {
		};
	}
	function websocketSend(message){
		if(websocket.readyState === WebSocket.OPEN){
			websocket.send(message);
		}
	}
	$(document).ready(function(){
		m_dialog();
		initMenu();
		//$(".sidebar-menu").html(html);
		connect();
		
	});  
</script>



</body>
</html>