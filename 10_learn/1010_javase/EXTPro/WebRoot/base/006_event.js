Ext.onReady(function(){
	
	
/*	
   //
	Ext.create('Ext.Panel',{
		title:'woshimianban' , 
		width:500 , 
		height:400 , 
		frame: true , 
		renderTo:Ext.getBody(),
		html:'<input type="button" id="btn" value="点击" />'
	});
*/
	
	Ext.create('Ext.Panel',{
		title:"这里是panel",
		width:500,
		height:400,
		frame:true,
		renderTo:Ext.getBody(),
		html:'<input type="button" id="btn" value="点击"/>',
		
//		dockedItems: [{
//        xtype: 'toolbar'
//   		}]
   		/*
   		listeners: {
			click:function(){
				alert('点击了');
			},
			 click: {
            element: 'el', //bind to the underlying el property on the panel
            fn: function(){ console.log('click el'); }
        },
			render:function(){
				alert('渲染了');
			}
		}
		*/
	});
//第一种拿到元素直接添加
	
//	Ext.get('btn').on('click',function(){
//		alert('点击了...');
//	});
	
	
	function test(){
		alert('点击了2');
	}
	Ext.EventManager.on('btn','click',test);
	Ext.EventManager.un('but','click',test);
	
	/**
	function test(){
		alert('dsadsa');
	}
	//EventManager
	Ext.EventManager.on('btn','click',test);
	Ext.EventManager.un('btn','click',test);
	*/
	
	/**
	var btn1 = Ext.create('Ext.Button',{
		text:'按钮', 
		renderTo:Ext.getBody()
	});
	btn1.on('click',function(){
		alert('执行了');
	});
	
	var btn2 = Ext.create('Ext.Button',{
		text:'挂起', 
		handler:function(){
			btn1.suspendEvents(false);
		},
		renderTo:Ext.getBody()
	});
	
	var btn3 = Ext.create('Ext.Button',{
		text:'恢复', 
		handler:function(){
			btn1.resumeEvents();
		},
		renderTo:Ext.getBody()
	});	
	*/ 
	
	
	/**
	var btn = Ext.create('Ext.Button',{
		text:'按钮', 
		handler:function(){
			btn.fireEvent('myEvent');
		},
		renderTo:Ext.getBody()
	});	
	
	var win = Ext.create('Ext.Window',{
		title:'窗口',
		width:500 , 
		height:300 , 
		listeners:{
			myEvent:function(){
				alert('执行啦');
			}		
		}
	}).show();
	
	win.relayEvents(btn , ['myEvent']);
	*/
	
	//给组件绑定事件
	/**
	var win = Ext.create('Ext.Window',{
		title:'窗口',
		width:500 , 
		height:300 //,
		//renderTo:Ext.getBody()
		, 
		listeners:{
			show:function(){
				alert('展示了..');
			} , 
			render:function(){
				alert('xuanranle..');
			}
		}
	
	});	
	*/
	/**
	win.on('show',function(){
		alert('show...');
	});
	win.on('render',function(){
		alert('render...');
	});	
	*/
	/**
	win.on({
		'show':function(){alert(11)} , 
		'render':function(){alert(22)}
	});	
	*/
	//win.show();
	
	/**
	var win = Ext.create('Ext.Window',{
		title:'窗口',
		width:500 , 
		height:300 //,
		//renderTo:Ext.getBody()
		, 
		closeAction:'hide' ,
		listeners:{
			show:function(){
				alert('展示了..');
			},
			single:true
			//delay:2000
		}
	
	});	

	var btn = Ext.create('Ext.Button',{
		text:'按钮', 
		handler:function(){
			win.show();
		},
		renderTo:Ext.getBody()
	});		

	*/
	
	
	
	
});