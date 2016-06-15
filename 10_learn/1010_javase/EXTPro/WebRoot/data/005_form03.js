Ext.onReady(function(){
	
	//checkbox、radio、使用布局类、触发器字段:
	var myform = Ext.create('Ext.form.Panel',{
		id:'myform' ,
		title:'单选、复选框、布局类',
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
			allowBlank:false ,				//不允许为空
			msgTarget:'side'
		} , 
		items:[{
			fieldLabel:'姓名' ,
			name:'username' , 
			id:'username',
			selectOnFocus:true
		},{
			xtype:'radiofield',				//圆选按钮
			fieldLabel:'性别' ,
			boxLabel:'男',					//文本内容在后面
			name:'sex' ,
			checked:true ,					//默认选中
			inputValue:1
		},{
			xtype:'radiofield',
			fieldLabel:'性别' ,
			boxLabel:'女',
			name:'sex',
			inputValue:2
		},{
			xtype:'checkboxfield' , 		//多选按钮
			inputValue:'1' ,
			fieldLabel:'爱好' , 
			name:'hobby',
			boxLabel:'java'
		},{
			xtype:'checkboxfield' , 
			inputValue:'2' ,
			fieldLabel:'爱好' , 
			name:'hobby',
			boxLabel:'javascript'
		},{
			xtype:'checkboxfield' , 
			inputValue:'3' ,
			fieldLabel:'爱好' , 
			name:'hobby',
			boxLabel:'c#'
		},{
			xtype:'radiogroup' ,			//分组单选框		
			fieldLabel:'性别',
			columns:2,						//设置列数 
			items:[{
						xtype:'radiofield',		//圆选按钮
						boxLabel:'是',			//文本内容在后面
						name:'isok' ,
						checked:true ,			//默认选中
						inputValue:1
					},{
						xtype:'radiofield',
						boxLabel:'否',
						name:'isok',
						inputValue:2
			}]
		},{
			xtype:'checkboxgroup',			//分组复选框
			fieldLabel:'类别',
			width:240 ,
			columns:3,						//设置列数 
			items:[{
						xtype:'checkboxfield' , 
						inputValue:'1' ,
						name:'category',
						boxLabel:'娱乐'										
					},{
						xtype:'checkboxfield' , 
						inputValue:'2' ,
						name:'category',
						boxLabel:'运动'						
					},{
						xtype:'checkboxfield' , 
						inputValue:'3' ,
						name:'category',
						boxLabel:'健康'			
			}]
		},{					
			xtype:'trigger' ,			//触发器组件(一般自己扩展)
			fieldLabel:'触发器',
			name:'tri',
			id:'tri',					
			onTriggerClick:function(){	//触发器事件(单击触发器按钮)
				alert('我执行了...');
			}
		}],
		dockedItems:[{						//锁定的Item
			xtype:'toolbar',				//工具条
			dock:'top',						//锁定到上面
			items:[{
				text:'选择全部爱好',
				iconCls:'table_look',
				handler:function(){
					//得到basic 操作表单对象
					var basic = Ext.getCmp('myform').getForm();
					//获取所有的field属性对象
					var fields = basic.getFields();	//返回一个集合对象
					fields.each(function(item){
						//如果name为hobby.则设置它选中即可
						if(item.getName() == 'hobby'){
							item.setValue(true);
						}
					});
				}
			}]
		}],
		buttons:[{
			text:'提交',
			handler:function(){
				//获取表单里的数据
				//var formdata = Ext.getCmp('myform').getForm().getValues();
				//console.info(formdata);
			}
		}]
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});