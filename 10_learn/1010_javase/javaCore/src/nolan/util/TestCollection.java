package nolan.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ����Collection�ӿڵĻ�������
 * ����Set�ӿڵĻ��������ͻ����÷������򡢲����ظ������Ƿ��ظ�ȡ���ڣ�equals��hashcode��
 * Collection���������ӽӿڣ�List(������ظ�)��Set(���򲻿��ظ�)��
 * @author Administrator
 *
 */
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		Collection c2 = new HashSet();
		 
		c.add("abc");
		//�Զ�װ�䣻��123ת��Ϊnew Integer(123);
		c.add(123);
		c.add(new String("gggg"));
		c.add(new String("hhhhh"));
		c.remove(123);
		c2.add("abc");
		
		
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("abc"));
		System.out.println(c.contains(new String("gggg")));//String ��д��equal()������
		System.out.println(c.containsAll(c2));
		
		java.util.List s;

	}

}
