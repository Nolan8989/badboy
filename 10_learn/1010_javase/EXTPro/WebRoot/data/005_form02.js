Ext.onReady(function(){
	
	//大文本、数字框:
	var myform = Ext.create('Ext.form.Panel',{
		id:'myform' ,
		title:'大文本、数字框',
		width:400 , 
		height:400 ,
		frame:true , 
		renderTo:Ext.getBody(),
		defaultType:'textfield' , 
		defaults:{
			bodyStyle:'padding:5 5 5 5' ,
			autoScroll:true , 
			labelWidth:50,
			width:200 ,
			labelSeparator:': ' ,
			labelAlign:'left' ,
			allowBlank:false ,	//不允许为空
			msgTarget:'side'
		} , 
		items:[{
			fieldLabel:'姓名' ,
			name:'username' , 
			id:'username',
			selectOnFocus:true
		},{
			xtype:'numberfield' ,		//微调xtype
			fieldLabel:'整数',
			allowDecimals:false , 		//不允许为小数的属性配置
			//hideTrigger: true , 		//隐藏微调按钮
			name:'number1',
			id:'number1'
		},{
			xtype:'numberfield' ,
			fieldLabel:'小数',
			name:'number2',
			id:'number2',
			emptyText:'可输入小数'		//空文本提示信息
		},{
			xtype:'numberfield' ,
			fieldLabel:'舍入' ,
			name:'number3' , 
			id:'number3' ,
			decimalPrecision: 3 		//舍入的小数位数控制字段
		},{
			xtype:'numberfield' ,
			fieldLabel:'范围' ,
			name:'number4' , 
			id:'number4' ,
			editable:false , 
			maxValue:10,				//控制字段的最大和最小值范围
			minValue:0 
		},{
			xtype:'numberfield' ,
			fieldLabel:'限制' ,
			name:'number5' , 
			id:'number5' ,
			baseChars:'0123' 			//输入限制控制
		},{
			xtype:'numberfield' ,
			fieldLabel:'步长' ,
			name:'number6' , 
			id:'number6' ,
			step:0.5 ,					//步长限定控制 
			value:10
		},{
			fieldLabel:'只读',
			name:'readonly' , 
			id:'readonly' ,		
			readOnly:true ,				//只读字段
			disabled:true ,				//禁用字段
			value:'我是只读的'
		},
		{
			xtype:'textarea' ,
			width:300 ,
			height:100 ,
			fieldLabel:'内容',
			name:'info',
			id:'info' 
		}] ,
		buttons:[{
			text:'提交',
			handler:function(){
				//获取表单里的数据
				var formdata = Ext.getCmp('myform').getForm().getValues();
				console.info(formdata);
			}
		}]
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});