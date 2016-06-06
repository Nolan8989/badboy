package norlando.usually.Integer;

/**
 * 测试包装类的基本用法
 *
 */
public class TestInteger {
	public static void main(String[] args) {
		//基本数据类型和包装类的转化
		Integer i = new Integer(234);
		int i4 = i.intValue();
		
		
		//包装类和字符串的相互转换
		System.out.println(Integer.toString(i));
		System.out.println(i.toString());//内部调用的toString(value);
//		System.out.println(""+i); 
		Integer i2 = new Integer("345");
		
//		Integer i3 = Integer.parseInt("frt");  //java.lang.NumberFormatException: For input string: "frt"
		
		
		
		//自动装箱和拆箱(编译器帮助我们添加相关代码)
		Integer m = 32;   //装箱。  编译器会帮助我们添加：new Integer(32);
		int n = new Integer(324);   //拆箱。  编译器帮助我们添加：new Integer(324).intValue();
		
		Integer a = new Integer(123);
		Integer b = new Integer(123);
		System.out.println(a==b);    //false
		System.out.println(a.equals(b)); 
		
		
		//题外话：自动装箱和拆箱时，对于[-128,127]之间的数，为了提高效率，会进行缓存处理。
		Integer a2 = 123;
		Integer b2 = 123;
		System.out.println(a2==b2);   //true
		
	}
}


class MyInteger /*extends Number */{
	int value;

	public MyInteger(int value){
		this.value = value;
	}
	
}