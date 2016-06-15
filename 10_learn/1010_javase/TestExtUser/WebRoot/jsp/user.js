Ext.onReady(function(){
	
	
	
	Ext.QuickTips.init();
	Ext.Loader.setConfig({
		enabled:true
	});
	
	
	//数据模型
	Ext.define('UserModel',{
		extend:'Ext.data.Model' , 
		fields:['id' , 'username' , 'password' , 'sex' , 'age' , 'birthday' ,'salary' ,'description' ]
	});
	
	//数据集合
	Ext.define('UserStore',{
		extend:'Ext.data.Store' , 
		model:'UserModel' , 
		proxy:{
			type:'ajax' , 
			url:'UserServlet?method=getPageList' ,
			reader:{
				type:'json' ,
				root:'rows' ,
				totalProperty:'total'
			}
		} ,
		currentPage:1 , 	//page
		pageSize:5			//limit , 
	});
	
	
	//grid.Panel
	Ext.define('UserView',{
		id:'user_view' , 
		extend:'Ext.grid.Panel' , 
		title:'用户列表' , 
		width:'100%' ,
		height:'100%' ,
		forceFit:true ,
		renderTo:Ext.getBody() , 
		frame:true ,
		icon:'extjs/icons/table/table.png' ,
		columns:[{
			xtype:'rownumberer' , 
			text:'序号' , 
			align:'center'
		},{
			text:'用户名' ,
			dataIndex:'username' , 
			align:'center'
		},{
			text:'性别' ,
			dataIndex:'sex' , 
			align:'center'			
		},{
			text:'年龄' ,
			dataIndex:'age' , 
			align:'center'		
		},{
			text:'薪水' ,
			dataIndex:'salary' , 
			align:'center'		
		},{
			text:'出生日期' ,
			dataIndex:'birthday' , 
			align:'center'		
		},{
			text:'个人描述' ,
			dataIndex:'description' , 
			align:'center'		
		}] ,
		dockedItems:[{
			xtype:'pagingtoolbar' , 
			dock:'bottom' , 
			displayInfo: true
		}] , 
		tbar:[{
			text:'新增用户' , 
			icon:'extjs/icons/round/round_add.png' , 
			handler:function(btn){
				if(!Ext.getCmp('user_window')){
					var win = Ext.create('UserWindow');
					win.show();				
				}
			}
		},{
			text:'修改用户' ,
			icon:'extjs/icons/used/edit.png' ,
			handler:function(btn){
				var grid = btn.up('grid');//取得当前数据表格
				var selectmodel = grid.getSelectionModel();//根据数据表格获取当前表格的选择模式
				var datas = selectmodel.getSelection();//根据选择模式对象获取当前选中的记录
				if(datas.length != 1){
					Ext.Msg.alert('提示信息','只能选择一条记录进行修改!');
				} else {
					var editModel = datas[0];
					//使用UserWindow 修改[ 1 根据id进行修改  2基本配置需要更改 3提交的url参数需要变化  4数据显示form表单中]
					var win = Ext.create('UserWindow',{operation:'update'});
					win.setTitle('修改用户信息');
					win.down('form').getForm().loadRecord(editModel);
					win.show();
				}
			}
		},{
			text:'删除用户' , 
			icon:'extjs/icons/round/round_delete.png' , 
			handler:function(){
			
			}
		},
		'-',
		{
			text:'查询用户' ,
			icon:'extjs/icons/used/zoom.png' ,
			handler:function(btn){
				//alert(Ext.getCmp('inputQuery').getValue()); //张
				var query = Ext.getCmp('inputQuery').getValue();
				var userStore = btn.up('grid').getStore();
				userStore.proxy.extraParams.query = query ; 
				userStore.load();
				
			}
		},{
			xtype:'textfield' , 
			id:'inputQuery'
		}],
		initComponent:function(arguments){
			var self = this ; 
			var userStore = Ext.create('UserStore'); 
			userStore.load();
			self.store = userStore;
			self.dockedItems[0].store = userStore;
			//必须要有的
			self.callParent(arguments);
		}
	});
	
	
	Ext.define('UserWindow',{
		id:'user_window' ,
		extend:'Ext.window.Window' , 
		operation:'save' ,
		title:'新增用户信息' ,
		requires:['Ext.form.Panel'] ,
		modal:true , 
		constrain:true , 
		closable:false ,
		items:[{
			xtype:'form' ,
			frame:true ,
			bodyStyle: 'padding:5 5 5 5;' ,
			defaults:{
				labelWidth:100 , 
				labelAlign:'center' ,
				width:350 ,
				msgTarget:'side' , 
				allowBlank:false 
			} , 
			defaultType:'textfield' ,
			items:[{
				name:'id' , 
				xtype:'hidden'
			},{
				fieldLabel:'用户名' ,
				name:'username' 
			},{
				fieldLabel:'密码',
				name:'password' , 
				inputType:'password'
			},{
				fieldLabel:'年龄' ,
				name:'age' , 
				xtype:'numberfield' , 
				minValue:0 , 
				maxValue:120
			},{
				fieldLabel:'性别' , 
				xtype:'radiogroup' ,
				columns: 2 ,
				items:[{
					name:'sex' , 
					boxLabel:'男' , 
					checked:true ,
					inputValue:'男'
				},{
					name:'sex' , 
					boxLabel:'女' ,
					inputValue:'女'
				}]
			},{
				fieldLabel:'出生日期' , 
				name:'birthday' , 
				xtype:'datefield' , 
				format:'Y-m-d'
			},{
				fieldLabel:'薪水', 
				name:'salary' , 
				xtype:'numberfield'
			},{
				fieldLabel:'个人描述',
				name:'description' ,
				xtype:'htmleditor' , 
				width:400
			}],
			buttons:[{
				text:'确认' , 
				handler:function(btn){
					var form = btn.up('form');
					var basic = form.getForm();
					
					var win = btn.up('window');
					
					basic.submit({
						clientValidation:true , 
						url:'UserServlet' ,
						params:{
							method: win.operation
						},
						waitTitle:'.....' , 
						success:function(form  ,action){
							Ext.Msg.alert('提示信息',action.result.msg);
							btn.up('window').close();
							Ext.getCmp('user_view').store.load();
						} , 
						failure:function(form , action){
							Ext.Msg.alert('提示信息',action.result.msg);
						}
					});
				}
			},{
				text:'取消' ,
				handler:function(btn){
					btn.up('window').close();
				}
			}]
		}]
	});
	
	
	
	
	
	
	
	
	
	
	
	
	Ext.create('UserView');
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});