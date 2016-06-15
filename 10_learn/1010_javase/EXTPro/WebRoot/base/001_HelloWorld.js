Ext.onReady(function(){
	//Ext.MessageBox.alert('标题','内容');
	Ext.Msg.show({
    title: 'Address',
    msg: 'Please enter your address:',
    width: 300,
    buttons: Ext.Msg.OKCANCEL,
    multiline: true,
    fn: function(a,b){alert(a);alert(b);},
//    animateTarget: 'addAddressBtn',
    icon: Ext.window.MessageBox.INFO
});
});
