Ext.onReady(function(){
	/**
	 *  Ext.form.field.Time			(时间字段)
	 *  Ext.form.field.Date			(日期字段)
	 *  Ext.form.field.Hidden		(隐藏字段)
	 *  Ext.form.field.Display		(展示字段)
	 *  Ext.form.Label				(标签)
	 *  Ext.form.FieldSet			(字段集合)
	 *  Ext.form.Field.File			(上传文件字段)
	 *  Ext.form.field.HtmlEditor	(富文本框)
	 *  Ext.form.FieldContainer 	(表单字段的拼接)
	 */	
	//初始化
	Ext.Loader.setConfig({
		enabled:true 
	});
	Ext.QuickTips.init();
	
	//时间选择器
	Ext.create('Ext.form.Panel',{
		id:'mydata' ,
		width:650,
		height:550 , 
		title:'时间选择器',
		frame: true , 
		bodyStyle:'padding:5 5 5 5',
		renderTo:Ext.getBody(),
		defaults:{						//默认配置表单项
			labelSeparator:": " ,
			labelWidth:70 , 
			labelAlign:'left' ,
			width:300 ,
			//allowBlank:false ,
			msgTarget:'side' 
		},
		items:[{
			xtype:'timefield',						//时间选择器
			fieldLabel:'时间',
			width:300 ,
			minValue:'9:00'  ,						//最小时间 
			maxValue:'18:00' ,						//最大时间
			minText:'时间大于{0}' ,					//错误提示信息
			maxText:'时间小于{0}' ,
			format:'G时i分s秒' ,						//格式化日期
			increment:60 ,							//时间的跨度(默认15分钟)
			invalidText:'时间格式错误!',				//时间验证提示
			pickerMaxHeight:100						//弹出列表的高度
		},{
			xtype:'datefield',						//日期选择器
			fieldLabel:'日期',
			width:300 ,
			minValue:'01/01/2013',					//最小日期
			maxValue:'31/12/2013',					//最大日期
			disabledDays:[0,6],						//六、七 时间禁用
			disabledDates:['13年05月01日'],			//具体某天不能选择
			disabledDatesText:'这个日期不能被选择'	//提示信息
		},{
			xtype:'hidden',							//隐藏字段(Ext.form.field.Hidden)
			name:'age',
			value:'30'
		},{
			xtype:'displayfield', 					//显示字段(Ext.form.field.Display)
			name:'show',
			value:'我是展示信息!',					//注意value不会提交到后台,仅仅是一个信息的展示
			fieldLabel:'展示'
		},{
			xtype:'label' ,							//标签字段(Ext.form.Label)
			name:'lab' ,
			forId:'myInput' ,						//这个id和下面的inputId对应(上下布局)
			text:'标签',
			overCls:'red'							//当鼠标滑过标签时添加样式
		},{	
			xtype:'textfield' ,						
			name:'labinput' , 
			value:'内容!',
			inputId:'myInput'
		},{
			title:'组合信息集合' ,
			xtype:'fieldset',						//集合字段(Ext.form.FieldSet)
			collapsed:true ,						//是否收起集合字段
			collapsible:true ,					//是否展示伸缩按钮
			//checkboxToggle:true ,					//用复选框展示伸缩
			defaultType:'textfield' ,
			defaults:{
				anchor:'95%'						//占用字段的位置
			},
			layout:'anchor',						//百分比布局
			items:[{
				fieldLabel:'姓名' , 
				name:'name'
			},{
				fieldLabel:'密码' , 
				name:'password'
			}]
		},{
			xtype:'filefield' ,					//附件上传字段(File)
			name:'photo' , 
			fieldLabel:'照片',
			buttonText:'请上传文件'				//上传按钮上的文字
		},{
			xtype:'htmleditor' ,					//富文本框(Ext.form.field.HtmlEditor)
			name:'content',
			width:600 ,
			height:140 ,
			fontFamilies:['宋体','黑体','楷体'],
			defaultLinkValue:'http://www.bjsxt.com'	//默认超链接
		}],
		buttons:[{
			text:'提交',								//提交
			handler:function(){
				//up方法获得当前组件的上级组件 然后获取basic操作submit方法
				this.up('form').getForm().submit({
					//url 
					params:{
						info:'age is hidden field!'
					}
				});	
			}
		},{
			text:'上传文件' ,
			handler:function(){
				this.up('form').getForm().submit({
					url:'base/005_smartupload.jsp' , 
					waitMsg: '文件上传中...' ,
					success:function(){
						Ext.Msg.alert('提示信息','上传成功!');					
					}
				});
			}
		}]
	});

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});