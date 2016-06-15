Ext.onReady(function (){
	
	
// 简单model 的定义、创建、和验证
/**
	Ext.data.validations.lengthMessage = '错误长度...';
	Ext.data.validations.inclusionMessage = '性别不正确,应为男或女...';
	Ext.data.validations.exclusionMessage = 'admin@aa.com已经被占用';
	
	
	// 给验证类添加新的方法.
	Ext.apply(Ext.data.validations,{
		number : function(config,value){
			if(value === undefined){
				return false;
			};
			
			
			var min = config;
			var max = value;
			
			if ((value < min) || (value > max)) {
	            return false;
	        } else {
	            return true;
	        }
		},
		numberMessage : '年龄应在2-120之间...'
	});
	Ext.define("UserModel",{
		extend: 'Ext.data.Model',
		fields: [
		{name :'name',         type :'string'},// 不写 type默认是auto'
		{name :'age',       type :'int'},
		{name :'sex',	    type : 'string'},
		{name :'email',	    type : 'string'},
		{name : 'birthday',  type : 'date'}
		],
		validations:[  //Ext.data.Model的属性,本身在Ext.data.validations.
		{field : 'name',  type : 'length', min : 2}, // 这里的type是Ext.data.validations的方法.
		{field : 'age',   type : 'number', min : 0 ,  max : 120},//自定义验证方法.	
		{field : 'sex',   type : 'inclusion', list : ['男','女']},//包含验证.
		{field : 'email', type : 'exclusion', list :['admin@aa.com']},//不包含验证.
		{field : 'email', type : 'format', matcher:/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/}
		]
	});
	
	var p  = Ext.create('UserModel',{
		name:'张',
		age : -6,
		sex : '个',
		email :'admin@aa.com',		
		birthday : new Date(1990,08,01)
	});
	//alert(p.get('name'));

	
	//提示错误信息
	var errors = p.validate(); // Ext.data.Errors  继承自Ext.util.MixedCollection
	errors.each(function (item ,index){
		alert(item.field + ':' + item.message + '  ' + index); // item是个对象
		
	});
*/	

	
	
	
// hasMany(一对多) belongsTo(多对一)
// user    product
// 测试从010_association.jsp中取数据.
//定义的Model里面的fields只要后台数据有就可以取出来。可以不是一一对应.

	Ext.define('User',{
		extend : 'Ext.data.Model',
		fields : [
		{name : 'id' , type : 'int'},
		{name : 'name' , type : 'string'}
		],
		hasMany :{
			model : 'Product',
			name : 'products'  //可以自动生成一个products()方法.
		},
		
		proxy:{ // 代理
			type : 'ajax',
			url : 'data/010_association.jsp'
		}
	});
	
	Ext.define('Product',{
		extend :'Ext.data.Model',
		fields :	[
		{name : 'id' , type : 'int'},
		{name : 'name',type : 'string'}
		],
		belongsTo :'User',  //会自动生成一个getUser()方法.
		
		proxy :{
			type:'ajax' , 
			url:'data/010_association.jsp' ,
			reader:{
				type:'json' , 
				root:'products'
			}
		}
	});


	var user = Ext.ModelMgr.getModel('User');
	user.load(1,{
	    success: function(user, operation) {
			console.info(user);
	    	alert(user.get('name'));
	    	var pros = user.products();		//得到produnts数据集合
	    	pros.each(function(rec){
	    		alert(rec.get('name'));
	    	});

	    }
	});


	
//可以取到后台的user 但是似乎实例pro和user 没有联系.	
//	var pro = Ext.ModelManager.create({
//		id:1 , 
//		name:'dsadsa'
//	},'Product');
//	pro.getUser(function(rec , op){
//		alert(rec.get('name'));
//	});	
	




//proxy:数据代理( ajax memory)   //store
//Ajax
/**
	Ext.define('User' , {
		extend:'Ext.data.Model' , 
		fields:[
			{name:'id' ,type:'int'},
			{name:'username' , type:'string'} , 
			{name:'age' , type:'int'}
		] 
	});	
	
	
	var userProxy = new Ext.create('Ext.data.proxy.Ajax',{
		model:'User',
		url:'UserServlet' , 
		extraParams:{
			method:'getPageList'
		},
		reader:{
			type:'json'
		}
	});
	
	userProxy.doRequest(new Ext.data.Operation({
		action:'read' ,
		limit:5 , 
		start:2 ,
		sorters:[
			new Ext.util.Sorter({
				direction:'desc' , 
				property:'age'
			})
		]
	}) , function(result){
		var datas = Ext.decode(result.response.responseText);
		Ext.Array.each(datas,function(item){
			alert(item.username);
		});
	}
*/

	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});