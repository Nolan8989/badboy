package norlando.util.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * ����û�ж�̬����̬������������Ϊ������instanceof���
 * @author Administrator
 *
 */
public class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object obj ="abc"; //��̬
		
		//���� û�ж�̬
		/*
		Student3<Object> stu =new Student3<String>();		//��
		test3(new ArrayList<String>());						//��
		*/
	}
	//û�ж�̬
	public static void test3(List<Object> obj){
			
	}
	
	
	
	
	//�β�ʹ�ö�̬
	public static void test1(Object obj){
		
	}
	//��������ʹ�ö�̬
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
