function callHttp(url,param,successCallback,errorCallback){
	$.ajax({
		type:'post',
		url:url,
		data:param,
		success:function(data){
			if(data && data.status==200 ){
				if(successCallback != null){
					successCallback(data);
				}
			}else{
				if(errorCallback !=null){
					error(data.msg);
				}
			}
		}
	});
}