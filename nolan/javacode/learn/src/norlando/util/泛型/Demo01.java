package norlando.util.����;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ͨ��� 
 * 1��?�����Ͳ�����ֻ��ʹ���ڡ������ϣ������ֲ��������βΣ�
 * 2��extends ����:���� <=
 * 3��super ����:���� >=
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
		//����
		test2(new ArrayList<String>());
		test2(new LinkedList<String>());
		
		//����
		test3(new ArrayList<String>());
		test3(new LinkedList<Object>());
		test3(new LinkedList<CharSequence>());
	}
	//? ���Ͳ���
	public static void test1(List<?> list){
		
	}
	//extends ����   <=����
	public static void test2(List<? extends String> list){
		
	}
	//extends ����   <=����
	public static void test3(List<? super String> list){
			
	}
}
