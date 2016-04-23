package norlando.anon;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	@MyAnon(value="laogao")
	private String name ;
	
	public void say(){
		
		System.out.println("hello anontation");
	}
	
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class c = Test.class;
		Field field = c.getDeclaredField("name");
		Object obj = c.newInstance();
		
		//得到属性的注解对象
		MyAnon myanon = field.getAnnotation(MyAnon.class);
		
		
		
		String value = myanon.value();
		
		if(value.equals("xiaogao")){
			Method m =c.getDeclaredMethod("say");
			m.invoke(obj);
		}else {
			System.out.println("没有权限!");
		}
		
		
		
		
		
		
	}
}
