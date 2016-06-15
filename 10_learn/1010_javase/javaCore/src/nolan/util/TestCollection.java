package nolan.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 测试Collection接口的基本方法
 * 测试Set接口的基本方法和基本用法：无序、不可重复。（是否重复取决于：equals和hashcode）
 * Collection下有两个子接口：List(有序可重复)、Set(无序不可重复)。
 * @author Administrator
 *
 */
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		Collection c2 = new HashSet();
		 
		c.add("abc");
		//自动装箱；将123转换为new Integer(123);
		c.add(123);
		c.add(new String("gggg"));
		c.add(new String("hhhhh"));
		c.remove(123);
		c2.add("abc");
		
		
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("abc"));
		System.out.println(c.contains(new String("gggg")));//String 重写了equal()方法；
		System.out.println(c.containsAll(c2));
		
		java.util.List s;

	}

}
