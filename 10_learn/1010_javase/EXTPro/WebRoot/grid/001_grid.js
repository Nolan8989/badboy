Ext.onReady(function(){

	Ext.QuickTips.init();		//提示机制
	Ext.Loader.setConfig({		//启动Ext的动态加载机制
		enabled:true 
	});
	
	//数据
	var userDatas = [
		['李四','男',24,new Date(1989,04,29),'2800.17'],
		['张三','男',21,new Date(1990,08,07),'3000.5'],
		['张4','女',23,new Date(1988,08,07),'3000.880'],
		['张5','男',20,new Date(1991,08,17),'1000.5'],
		['张6','女',19,new Date(1980,08,05),'8000.5'],
		['张7','男',26,new Date(1970,08,07),'3000.5'],
		['张8','男',28,new Date(1960,08,07),'5000.5']
	];	
	
	//数据模型
	Ext.define('UserModel' , {
		extend:'Ext.data.Model' ,
		fields:[
			{name:'name' , type:'string'},
			{name:'sex'  , type:'string'},
			{name:'age'  , type:'int'},
			{name:'birthday' ,type:'date'},
			{name:'salary' , type:'string'}
		]
	});
	
	
	//数据集合
	var userStore = Ext.create('Ext.data.Store',{
		model : 'UserModel',
		proxy : { //1.代理类型 2.读取方式 3.数据的数据集合 4.自动读取
			type :'memory'  ,//内存读取
			reader :{
				type : 'array'//读取数组.
			}
		},
		data :userDatas,
		autoLoad :true //自动加载. 自动发送
		
	});
	
	
	Ext.create('Ext.grid.Panel' , {  //required:1.colums/store
		title:'用户列表' , 
		icon:'ext/icons/used/user.png' ,
		width:'40%' , 
		//height:300 , 
		frame:true , 
		renderTo:Ext.getBody() , 
		//forceFit:true ,
		store:userStore ,
		multiSelect:true , // 多选
		//selType:'checkboxmodel' ,
		columns:[{ //text,width,dataIndex
			xtype:'rownumberer' , 
			text:'序号' ,
			align:'center' , 
			width:50  ,
			locked:true
		},{
			text:'用户名' , 
			width:100 ,
			dataIndex:'name' ,//标题
			align:'center' ,
			sortable:true , //排序
			locked:true
		},{
			header:'性别' , 
			width:300 , 
			dataIndex:'sex',
			align:'center' , 
			renderer:function(value , meta , record){
//				console.info(value);
//				console.log(meta); //css样式
//				console.info(record);
				if(value =='男'){
					return '<span style=color:red>男</span>';
				} else {
					return '<span style=color:green>女</span>';
				}
			}
		},{
			text:'年龄' , 
			width:300 ,
			dataIndex:'age' , 
			align:'center' , 
			sortable:true
		},{
			text:'出生日期',
			width:400 , 
			dataIndex:'birthday' , 
			align:'center' , 
			sortable:true , 
			xtype:'datecolumn' , 
			format:'Y年m月d日'
		},{
			text:'薪水',
			width:350 , 
			dataIndex:'salary' , 
			align:'center' , 
			sortable:true
		}]
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});