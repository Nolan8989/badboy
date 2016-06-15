package nolan.refelct.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

public class TestRefelct {
/**
 * 学习使用反射的基础方法；
 * @param args
 * @throws Exception
 */
	public static void main(String[] args) throws Exception {
		Class c = User.class;
		//User u1 = new User();
		//Class uc = u1.getClass();
		//System.out.println(c);
		//System.out.println(uc);
		//System.out.println(u1.getClass());//得到对象的类

		//反射实例化对象；
		//User user1 =(User) c.newInstance();
		//System.out.println(user1);	
		
		
		
		Class b = B.class;
		System.out.println((ParameterizedType)b.getGenericSuperclass());
		

/*
		getName()：获得类的完整名字。
		getFields()：获得类的public类型的属性。
		getDeclaredFields()：获得类的所有属性。
		getMethods()：获得类的public类型的方法。
		getDeclaredMethods()：获得类的所有方法。
*/
		
/*
		System.out.println("c.getName()============>" +c.getName());
		System.out.println("c.getFields()===========>"+c.getFields());
		System.out.println("c.getDeclaredFields()===========>"+c.getDeclaredFields());
		System.out.println("c.getMethods()===========>"+c.getMethods());
		System.out.println("c.getDeclaredMethods()===========>"+c.getDeclaredMethods());
*/	


		
		
		
		//	Field类：代表类的成员变量。
/*
		Field[] fs = c.getDeclaredFields();
//		System.out.println(c.getDeclaredField("username"));
		for (Field f :fs){
			System.out.println(f);
			System.out.println(f.getName());
			System.out.println(f.getType()); //返回的类型是class<?>
		}
*/

		
		
		
		
		
		
		
		//	Method类：代表类的方法。

		//c.getDeclaredMethod(name, parameterTypes)
/*
		Method[] mts = c.getDeclaredMethods();
		for (Method mt: mts){
			System.out.println(mt.getReturnType());
			System.out.println(mt.getName());
		
		}
*/		
		
		
			
	}

}


class A<T>{
	
}

class B<T> extends A<T>{
	
}
