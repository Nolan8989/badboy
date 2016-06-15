Ext.onReady(function(){
	
//apply  applyIf	
/*示例
var s1 = {name:'张三',age:29};
	var s2 = {name:'李四',sex:'nan'};
	
	Ext.apply(s1,s2);
	Ext.applyIf(s1,s2);
	s1[0] = 'ko';
	alert(s1[0]);
	alert(s1.age);
	alert(s1.name);
	alert(s1.sex);
	*/
	
//Ext.each
	var countries = ['Vietnam', 'Singapore', 'United States', 'Russia'];
/*//示例 1
		Ext.Array.each(countries, function(name, index, countriesItSelf) {
	    console.log(name);
	});
*/
/*//示例 2
 		var sum = function() {
	    var sum = 0;
	    var l = Ext.Array.each(arguments, function(value) {
	         sum += value;
	    });
	    return sum;
	   
	};
	
	sum(1, 2, 3); // 返回 6
*/	
/*//示例 3
 * 
 *  
 *  //	在回调函数中返回false，即可停止迭代过程。
	Ext.Array.each(countries, function(name, index, countriesItSelf) {
    alert(name);
    if (name === 'Singapore') {
        return false; // 此处中止
    }
});
*/			
/*//示例 4
		var a =[1,2,3,4,5,6];
		Ext.Array.each(a,function(temp){
			alert(temp);
		});
*/


//Ext.extend
		
		
		
//Ext.typeOf
//Ext.isEmpty
//Ext.override
//Ext.iterate
//Ext.namespace
//Ext.each
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});