Ext.onReady(function(){
	//Ajax

	
	Ext.Ajax.request({
		url:'data/008_ajaxdata.jsp',
		method:"POST",
		params:{
			id:1,
			name:"张三"
		},
		success:function(response , opts){
			//console.info(response);
			var obj = Ext.JSON.decode(response.responseText);
			Ext.MessageBox.alert('提示信息', obj.msg);
			//console.log('server-side failure with status code ' + response.status);
			alert(Ext.JSON.encode(obj));
		} , 
		failure:function(response , opts){
			var obj = Ext.decode(response.responseText);
			Ext.MessageBox.alert('提示信息', obj.msg);	
			
		}
	});
	//Form
	
	
	
	
	
	
	
	
	
	
	
	
	
});