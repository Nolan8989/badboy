package norlando.util.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型没有多态，多态都是运行期行为，不能instanceof检查
 * @author Administrator
 *
 */
public class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object obj ="abc"; //多态
		
		//泛型 没有多态
		/*
		Student3<Object> stu =new Student3<String>();		//错
		test3(new ArrayList<String>());						//错
		*/
	}
	//没有多态
	public static void test3(List<Object> obj){
			
	}
	
	
	
	
	//形参使用多态
	public static void test1(Object obj){
		
	}
	//返回类型使用多态
	public static Object test2(String car){
		return "adf";
	}
}

class Student3<T>{
	private T htmlScore;
	public Student3() {
	// TODO Auto-generated constructor stub
}
	public Student3(T htmlScore) {
		super();
		this.htmlScore = htmlScore;
	}

	public T getHtmlScore() {
		return htmlScore;
	}

	public void setHtmlScore(T htmlScore) {
		this.htmlScore = htmlScore;
	}
	
}
