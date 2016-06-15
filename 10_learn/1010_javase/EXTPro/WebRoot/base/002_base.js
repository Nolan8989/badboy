Ext.onReady(function (){
	
/**
	Ext.define('Call',{
		alias:'op',
		
		//定义属性
		config:{
			name:'z3',
			age:18
		},
		//普通方法：
		say:function(){
			alter('enene');
		},
		
		
		//构造方法
		constructor:function(config){
			var self = this;
			self.initConfig(config);
		}
		
		
	});
	
	//初始化
	var p = Ext.create('op',
		{name:'l4'}
	);
	alert(p.getName());
	alert(p.getAge());
	
*/	
	
//继承
	
/**
	Ext.define('Pub',{
		config:{
			name:'z3',
			age:20
		},
		//静态块 子类不能被继承过去
		statics:{
			id:10
		},
		//静态块 子类可以被继承过去
		inheritableStatics:{
			iid:11,
			ek:function(){
				alert('静态方法');
			}
		},
		
		say:function(){
		alert('我是方法')
		},
		
		constructor:function(cof){
			var self = this;
			self.initConfig(cof);
		}
	
	});
//子类	
	Ext.define('Sub',{
		extend:'Pub',
		alias:'kokokko', //别名
		alternateClassName:'okokook',//备份名
		config:{
			sex:'男'
		}
	});
	
	var sub = Ext.create('Sub',{
		name:'haha',
		age:1000000
		
	});
	
	alert(sub);  //[object Object]
	alert(sub.getName());
	alert(sub.getAge());
	alert(sub.getSex());
	sub.say();
	
	alert(Sub.id);//undefined
	alert(Sub.iid);
	Sub.ek(); // 有静态方法。
*/
	
//多继承	
/**
	Ext.define('Say',{
		canSay:function(){
			alert('say....');
		}
		
	});	
	
	Ext.define('Sing',{
		canSing:function(){
			alert('sing...');
		}
		
	});
	
	Ext.define('User',{
		mixins:{
			say:'Say',
			sing:'Sing'
		}
		
	});
	
	var u = Ext.create('User');
	u.canSay();
	u.canSing();
	alert(u.constructor());//[object Object]
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});