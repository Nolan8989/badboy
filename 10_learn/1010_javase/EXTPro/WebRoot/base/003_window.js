Ext.onReady(function(){
//	Ext.widget('window',{
//	    title: 'Hello2',
//	    height: 200,
//	    width: 400	
//	}).show();
	
	//Ext.window.Window  Ext.Window  wdiget('window')  new Ext.window.Window({options});
	
	Ext.widget('button',{
		text:'我是按钮' , 
		handler:function(){
				if(!Ext.getCmp('mywin')){
						Ext.create('Ext.window.Window', {			//Component  ==> ComponentManager
							
							id:'mywin',
						    title: 'Hello1',
						    height: '300' ,		//Number  也可以是String 表示百分比
						    width: 600,
						    icon:'ext/icons/used/clipboard.png' , //iconCls
						    modal:true ,			//遮罩模式
							constrain:true , 
							autoScroll:true ,	
							closeAction:'hide' , 
							listeners:{
								render:function(){
									alert('渲染的时候执行的函数');
								},
								show:function(){
									//alert(win);
									alert('展示的时候执行');
								} , 
								titlechange:function(){
									alert('标题改变啦');
								}
							},
							fbar:[{
								xtype:'button' , 
								text:'新增' ,
								icon:'ext/icons/round/round_add.png' , 
								handler:function(btn){
									var win = Ext.getCmp('mywin');
									console.info(win);
								}
							},
							'-',
							{
								xtype:'button' , 
								text:'删除' ,
								icon:'ext/icons/round/round_delete.png' , 
								handler:function(){
									alert('点击啦2..');
								}		
							},{
							
								xtype:'datefield'
							},
							'->',{
								xtype:'button' , 
								text:'查询' , 
								icon:'ext/icons/used/zoom.png',
								hander:function(){
								}
							},{
								xtype:'textfield' , 
								allowBlank:false,
								msgTarget:'side'
							}]
					//		x:50 , 
					//		y:100
					//		draggable:false , 
					//		collapsible:true , 
							//html:'1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>1111<br>'
						}).show();					
					
				}
		},
		renderTo:Ext.getBody()
	});
	
	
	/**
	Ext.create('Ext.Panel',{
		id:'aa',
		title:'aaa' , 
		width:300 , 
		height:300 , 
		renderTo:Ext.getBody() , 
		listeners:{
				titlechange:function(){
					alert('标题改变啦');
				}		
		},
		fbar:[{
			xtype:'button' , 
			text:'新增' ,
			icon:'extjs/icons/round/round_add.png' , 
			handler:function(btn){
				var win = Ext.getCmp('aa');
				win.title='bbb';
				console.info(win);
			}
		}]	
	});
	*/

	
});