
var Script = function () {
	/**
	 * 在jquery中对于动态生成的dom，必须以这种方式来绑定事件，否则无法响应点击事件
	 */
	$('body').on('click' , '.sidebar .item.vertical > a' , function(){
		//alert("aaaaaaaaaaaaaaaaaaaa-----------");
		var ver = jQuery(this).next();
	    if (ver.is(":visible")) {
	        jQuery(this).parent().removeClass("open");
	        ver.slideUp(200);
	    } else {
	        jQuery(this).parent().addClass("open");
	        ver.slideDown(200);
	    }
	});
	/**
	 * 下面的方法，无法实现点击事件，是因为绑定事件，在页面一加载就完成，此时还没有生成dom数据，所以无法实现
	 * 绑定，必须按照上面的方式来进行事件的绑定
	 */
	//alert(jQuery('.sidebar .item.vertical > a'));
	$('.sidebar .item.vertical > a').on('click',function () {
		alert("aaaaaaaaaaaaaaaaaaaa-----------");
        var ver = jQuery(this).next();
        if (ver.is(":visible")) {
            jQuery(this).parent().removeClass("open");
            ver.slideUp(200);
        } else {
            jQuery(this).parent().addClass("open");
            ver.slideDown(200);
        }
    });

	$(function() {
        function responsiveView() {
            var wSize = $(window).width();
            if (wSize <= 768) {
                $('.main').addClass('sidebar-close');
                $('.sidebar .sidebar-menu').hide();
            }

            if (wSize > 768) {
                $('.main').removeClass('sidebar-close');
                $('.sidebar .sidebar-menu').show();
            }
        }
        $(window).on('load', responsiveView);
        $(window).on('resize', responsiveView);
    });

    $('.sidebar-toggle').click(function () {
        if ($('.sidebar .sidebar-menu').is(":visible") === true) {
            $('.main-content').css({
                'margin-left': '0px'
            });
            $('.sidebar').css({
                'margin-left': '-180px'
            });
            $('.sidebar .sidebar-menu').hide();
            $(".main").addClass("sidebar-closed");
        } else {
            $('.main-content').css({
                'margin-left': '180px'
            });
            $('.sidebar .sidebar-menu').show();
            $('.sidebar').css({
                'margin-left': '0'
            });
            $(".main").removeClass("sidebar-closed");
        }
    });

}();