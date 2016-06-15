function   checkForm(fieldObj,msgObj,re,nullMsg,errorMsg,require){
	var v = fieldObj.value.replace(/(^\s+)|(\s+$)/g,"");
	
	var flag = true;
	msgObj.innerHTML="";
	if(v.length==0){
		if(require){
		msgObj.innerHTML=nullMsg;
			flag =false;
			
		}
		
	}else  if(!(re.test(v))){
		flag=false;
		msgObj.innerHTML=errorMsg;
		
		
	}
	
	return flag;
}