Ext.onReady(function(){

	
	
	Ext.create('Ext.form.Panel',{
		title:'我是表单',
		width:400 ,
		height:300 , 
		bodyStyle:'padding:5 5 5 5' , 
		renderTo:Ext.getBody() , 
		frame:true ,
		defaults:{
			autoScroll:true  , 
			labelWidth:100 , 
			labelAlign:'center' ,
			allowBlank:false ,
			msgTarget:'side' ,
			width:300  //从窗体左边开始，左边的labelwidth也计算在内了。
		} ,
		defaultType:'textfield' ,
		items:[
			{
				fieldLabel:'用户名' ,  
				name: 'username' , 
				regex:/^[a-zA-Z0-9]{4,8}$/ ,
				regexText:'用户名必须在5位和10位之间！'  , 
				emptyText:'必填'
			},{
				fieldLabel:'密码' , 
				inputType:'password' , 
				name:'password' ,
				regex:/^[a-zA-Z0-9]{4,8}$/ ,
				regexText:'密码必须在5位和10位之间！'				
			},{
				fieldLabel:'年龄' , 
				xtype:'numberfield' ,
				name:'age' ,
				maxValue:120 , 
				minValue:0
			},{
				fieldLabel:'电子邮箱' ,
				name:'email' ,
				regex: /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/,
				regexText:'邮箱地址不正确!' 
			},{
				fieldLabel:'真实姓名' ,
				name:'realname' , 
				regex: /[\u4e00-\u9fa5]{2,5}/,
				regexText:'必须填中文!'				
			}
		] ,
		buttons:[{
			text:'提交' , 
			handler:function(btn){
				var myform = btn.up('form');
				var basic = myform.getForm();
				var username  = basic.findField('username');
				//alert(username.getValue());
				/**
				var con = basic.getFields();
				con.each(function(item){
					alert(item.getValue());
				});
				*/
				if(basic.isValid()){
						//请求...
				} else {
					Ext.MessageBox.alert('提示信息','表单不能提交!');
				}

				/**
				basic.submit({
					clientValidation:true ,
					url:'UserServlet' ,
					params:{
						method:'save'
					},
					success:function(form ,action){
						console.info(action);
						Ext.MessageBox.alert('提示信息',action.result.msg);
					} , 
					failure:function(form ,action){
					
					}
				});
				*/
				
			}
		},{
			text:'重置' ,
			handler:function(btn){
				var myform = btn.up('form');
				var basic = myform.getForm();	
				basic.reset();
			}			
		}]
		
	});
	
	
	
	
	
	
	
});