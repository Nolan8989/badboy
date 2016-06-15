Ext.onReady(function(){
	
	myWindow = Ext.create('Ext.window.Window', {
    title: 'Test Component animation',
    width: 500,
    height: 300,
    layout: {
        type: 'hbox',
        align: 'stretch'
    },
    items: [{
        title: 'Left: 33%',
        margins: '5 0 5 5',
        flex: 1
    }, {
        title: 'Left: 66%',
        margins: '5 5 5 5',
        flex: 2
    }]
});



myWindow.show();
/**
myWindow.header.el.on('click', function() {
    myWindow.animate({
        to: {
            width: (myWindow.getWidth() == 500) ? 700 : 500,
            height: (myWindow.getHeight() == 300) ? 400 : 300
        }
    });
});
*/


//默认上下对齐
  myWindows = Ext.create('Ext.window.Window',{
		title: 'ko',
    	width: 500,
   		 height: 300
		
	});
	myWindow.alignTo(myWindows.show());
	


		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*//	Ext.widget('window',{
//	    title: 'Hello2',
//	    height: 200,
//	    width: 400	
//	}).show();
	
	//Ext.window.Window  Ext.Window  wdiget('window')  new Ext.window.Window({options});
	
						var min = Ext.create('Ext.window.Window', {			//Component  ==> ComponentManager
							
							id:'mywin',
						    title: 'Hello1',
						    height: '300' ,		//Number  也可以是String 表示百分比
						    width: 600,
						    icon:'extjs/icons/used/clipboard.png' , //iconCls
						    //modal:true ,			//遮罩模式
							constrain:true , 
							autoScroll:true ,	
							closeAction:'hide' ,
							listeners:{
							
								render:function(min){
									 min.addUIClsToElement("");
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
								icon:'extjs/icons/round/round_add.png' , 
								handler:function(btn){
									var win = Ext.getCmp('mywin');
									console.info(win);
								}
							},
							'-',
							{
								xtype:'button' , 
								text:'删除' ,
								icon:'extjs/icons/round/round_delete.png' , 
								handler:function(){
									alert('点击啦2..');
								}		
							},{
							
								xtype:'datefield'
							},
							'->',{
								xtype:'button' , 
								text:'查询' , 
								icon:'extjs/icons/used/zoom.png',
								hander:function(){
								}
							},{
								xtype:'textfield' , 
								allowBlank:false,
								msgTarget:'side'
							}]
						}).show();
		
						
						
		Ext.widget('button',{
			text:'我是按钮' , 
			handler:function(){
				
			},
			renderTo:Ext.getBody()
			});
						
						 min.clearManagedListeners();
						
							
*/
	
});