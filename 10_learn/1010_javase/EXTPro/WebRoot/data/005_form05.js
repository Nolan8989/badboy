Ext.onReady(function(){

	//初始化
//	Ext.QuickTips.init();		//1 Ext组件的提示信息
//	Ext.Loader.setConfig({		//2 启动Ext的动态加载机制
//		enabled:true , 
//		app : 'js/extjs/ux'
//	});
	
	//数据模型(模板)、数据集合(承装数据)、数据代理(ajaxproxy)
	
	
	//部门类： // 数据模型
	Ext.define('Dept',{
		extend:'Ext.data.Model',
		fields:[
			{name:'id',  type:'auto'},
			{name:'name',type:'auto'}
		]
	});
	
	
	
	//数据集合	 //提供可视化组件的数据支撑
	var store = Ext.create('Ext.data.Store',{
		model:'Dept',
		data:[
			{id:'01',name:'销售部门'},
			{id:'02',name:'人事部门'},
			{id:'03',name:'产品部门'},
			{id:'04',name:'研发部门'},
			{id:'05',name:'管理部门'}
		]
	});
	
	
//	//loacl: combobox
	Ext.create('Ext.form.Panel',{
		id:'myform',
		title:'Combobox本地示例',
		renderTo:Ext.getBody(),
		bodyStyle:'padding: 5 5 5 5' , 
		width:300 , 
		height:200 , 
		frame:true ,					//渲染
		defaults:{						//默认配置表单项
			labelSeparator:": " ,
			labelWidth:70 , 
			labelAlign:'left' ,
			width:200 ,
			allowBlank:false ,
			msgTarget:'side'
		},
		items:[{
			xtype:'combobox' ,
			fieldLabel:'选择部门' ,
			id:'cbox',
			name:'cbox' ,
			//控制下拉列表的样式:配置项(根据Ext.view.BoundList进行初始化)
			listConfig:{				
				emptyText:'没有找到数据' ,	//没找到的数据属性配置
				maxHeight:200 				//最大的高度
			},
			queryMode:'local', 				//选择combobox模式[local、remote]
			store:store ,					//数据集合
			store:store,
			valueField:'id',				//后台传递的值
			displayField:'name' ,			//前台展示的值
			forceSelection:true ,			//不允许使用数据集合中没有的数值
			typeAhead:true ,				//自动补全信息			
			value:'01'						//默认值
		}]
	});
	 
	/**
	//数据模型
	Ext.define('User',{
		extend:'Ext.data.Model' , 
		fields:[{
			name:'id' , type:'string'
		},{
			name:'username' , type:'string'
		},{
			name:'style' , type:'string'
		}]
	});

	var store = Ext.create('Ext.data.Store' , {
		model:'User',
		proxy:{
			type:'ajax' , 
			url:'userAction!getComboUsers.action'  , 
			reader:{
				type:'json'
			}			
		} 
	});	
	
	Ext.create('Ext.form.Panel',{
		id:'myformRemote',
		title:'Combobox异步示例',
		renderTo:Ext.getBody(),
		bodyStyle:'padding: 5 5 5 5' , 
		width:350 , 
		height:200 , 
		frame:true ,					//渲染
		defaults:{						//默认配置表单项
			labelSeparator:": " ,
			labelWidth:70 , 
			labelAlign:'left' ,
			width:300 ,
			allowBlank:false ,
			msgTarget:'side' 
		},		
		items:[{
			xtype:'combobox' ,
			fieldLabel:'选择用户' ,
			id:'cboxRemote',
			name:'cboxRemote' ,
			//控制下拉列表的样式:配置项(根据Ext.view.BoundList进行初始化)
			listConfig:{				
				emptyText:'没有找到数据' ,	//没找到的数据属性配置
				maxHeight:200 ,				//最大的高度
				getInnerTpl:function(){		//配置特殊字段的样式
					return "<div style=color:{style} >【{username}】</div>"; 	//这个非常好用 
				}
			},
			queryMode:'remote', 				//选择combobox模式[local、remote]
			store:store ,						//数据集合
			valueField:'id',					//后台传递的值
			displayField:'username' ,			//前台展示的值
			minChars:1 , 						//最小字符请求后台
			//multiSelect:true ,				//允许多选形式
			queryDelay: 500 ,					//延迟时间
			queryParam:'param'					//数据参数
		}]		
	});
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});