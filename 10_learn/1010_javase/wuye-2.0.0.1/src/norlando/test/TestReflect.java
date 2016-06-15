package norlando.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.sun.corba.se.impl.orb.ParserTable.TestBadServerIdHandler;

public class TestReflect {
	public static void testClass(){
////		1.
//		
//		Class clazz;
//		try {
//			clazz = Class.forName("com.bjsxt.test.TestBean");
//			System.out.println(clazz.getName());
//			System.out.println(clazz.getSimpleName());
//			System.out.println(clazz.getPackage());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		2.
//		Class clazz = TestBean.class;
//			System.out.println(clazz.getName());
//			System.out.println(clazz.getSimpleName());
//			System.out.println(clazz.getPackage());
			
//			3.
			TestBean tb = new TestBean();
			Class clazz = tb.getClass();
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackage());
			
		
	}
	
	
	public static void testField(){
		Class clazz = TestBean.class;
		Field[] fs = clazz.getDeclaredFields();
//		for (int i = 0; i < fs.length; i++) {
//			Field f = fs[i];
//			System.out.println(f.getType());
//		}
//		
		
		try {
//			Field f = clazz.getDeclaredField("uname");
////			System.err.println(f.get);
//			f.setAccessible(true);
//			Object object = clazz.newInstance();
//			f.set(object, "testts");
//			
//			System.out.println(((TestBean)object).getUname());
			Field f = clazz.getDeclaredField("email");
			f.setAccessible(true);
			Object object = clazz.newInstance();
			
			f.set(null, "aaaaa@111.com");
			System.out.println(((TestBean)object).getEmail());
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	
	
	public static void testMethod(){
		Class clazz = TestBean.class;
		try {
//			Method m = clazz.getDeclaredMethod("add", new Class[]{int.class,int.class});
//			m.setAccessible(true);
			Object obj  = clazz.newInstance();
//			m.invoke(obj, new Object[]{123,123});
//			
			Class clazz2  = TestReflect.class;
			System.out.println(clazz.isInstance(obj));
			System.out.println(clazz2.isInstance(obj));
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}
	
	public static void main(String[] args) {
//		testClass();
//		testField();
		testMethod();
	}
}
