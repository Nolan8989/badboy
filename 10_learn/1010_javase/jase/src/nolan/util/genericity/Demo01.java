package nolan.util.genericity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 通配符 
 * 1、?　类型不定，只能使用在　声明上（声明局部变量、形参）
 * 2、extends 父类:上限 <=
 * 3、super 子类:下限 >=
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<?> list =new ArrayList<String>();
		test1(new ArrayList<String>());
		test1(new LinkedList<Integer>());
		//上限
		test2(new ArrayList<String>());
		test2(new LinkedList<String>());
		
		//下限
		test3(new ArrayList<String>());
		test3(new LinkedList<Object>());
		test3(new LinkedList<CharSequence>());
	}
	//? 类型不定
	public static void test1(List<?> list){
		
	}
	//extends 上限   <=基类
	public static void test2(List<? extends String> list){
		
	}
	//extends 上限   <=基类
	public static void test3(List<? super String> list){
			
	}
}
