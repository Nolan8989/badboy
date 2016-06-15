
//模拟jquery
//传window是为了提高运行效率，这样闭包里面的代码需要找window不必到外面去找。
//传undefined 是为了防止外部代码，破坏undefined的本质
(function(window,undefined  ) {

//	alert(undefined);
// 	var t2 ;
//	if(t2==undefined){

// 	alert(t)

//	}

	var jQuery=function(id){
		var ele;
		if(id.indexOf("#")!=-1){

			alert("test"+id)
			var  idm = id.substring(1);
			ele = document.getElementById(idm);
		}

		return ele;
	}


	function createAjax(){
		var req = null;

	 	if(window.XMLHttpRequest){
			req = new XMLHttpRequest();
	 	}else if(window.ActiveXObject){
			req  = new ActiveXObject("Msxml2.XMLHTTP");
			
	 	}else{
				alert("浏览器太旧了...");
	 	}

	 	return req;
	
	}
	
 	jQuery.ajax=function(options){
			//alert("ddd" +options.type)
			
			if(options.async==undefined){
				options.async= true;
			}
			if(options.dataType==undefined){
				
				options.dataType= "text";
			}
			if(options.data==undefined){
				
				options.data="";
			}
			var req = createAjax();

		 	req.onreadystatechange=function(){
				//alert(req.readyState);

				if(4==req.readyState){
					if(options.success){
						if(options.dataType=="text"){
							var t = req.responseText;
							options.success(t);
						}else if(options.dataType=="xml"){
							var t2 = req.responseXML;
							options.success(t2);
						}else if(options.dataType=="json"){
							var t = req.responseText;
							eval("var jo = "+t);
							options.success(jo);

						}
					}
				}else{
					if(options.waitfunc){
						options.waitfunc();
					}		
				}
				
		 	}

		 	if("get"==options.type.toLowerCase()){
			 	if(options.url.indexOf("?")!=-1){
					req.open(options.type,options.url+"&"+options.data,options.async);
			 	}else{
					req.open(options.type,options.url+"?"+options.data,options.async);
				 	}
			 	req.send(null);

			 }else if("post"==options.type.toLowerCase()){
				req.open(options.type,options.url,options.async);
				req.setRequestHeader("content-type","application/x-www-form-urlencoded");
			 	req.send(options.data);

			 }
 	
 	}

	
	window.jQuery = window.sxt = jQuery
})(window);

