package norlando.refelct.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

public class TestRefelct {
/**
 * ѧϰʹ�÷���Ļ���������
 * @param args
 * @throws Exception
 */
	public static void main(String[] args) throws Exception {
		Class c = User.class;
		//User u1 = new User();
		//Class uc = u1.getClass();
		//System.out.println(c);
		//System.out.println(uc);
		//System.out.println(u1.getClass());//�õ��������

		//����ʵ��������
		//User user1 =(User) c.newInstance();
		//System.out.println(user1);	
		
		
		
		Class b = B.class;
		System.out.println((ParameterizedType)b.getGenericSuperclass());
		

/*
		getName()���������������֡�
		getFields()��������public���͵����ԡ�
		getDeclaredFields()���������������ԡ�
		getMethods()��������public���͵ķ�����
		getDeclaredMethods()�����������з�����
*/
		
/*
		System.out.println("c.getName()============>" +c.getName());
		System.out.println("c.getFields()===========>"+c.getFields());
		System.out.println("c.getDeclaredFields()===========>"+c.getDeclaredFields());
		System.out.println("c.getMethods()===========>"+c.getMethods());
		System.out.println("c.getDeclaredMethods()===========>"+c.getDeclaredMethods());
*/	


		
		
		
		//	Field�ࣺ������ĳ�Ա������
/*
		Field[] fs = c.getDeclaredFields();
//		System.out.println(c.getDeclaredField("username"));
		for (Field f :fs){
			System.out.println(f);
			System.out.println(f.getName());
			System.out.println(f.getType()); //���ص�������class<?>
		}
*/

		
		
		
		
		
		
		
		//	Method�ࣺ������ķ�����

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
