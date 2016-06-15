package nolan.util.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


/**
 * 测试List中的基本方法
 * List中的方法分为两大类：
 * 一类是从Collection中继承过来的，用法基本一致！
 * 第二类是添加的跟顺序、索引相关的方法！(大家重点测试和体会！)
 *
 */
@SuppressWarnings("all")
public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(123);
		list.add(123);
		list.add(new Student("张三"));
		list.add(new Student("李四"));
		list.add(123);
		
		System.out.println(((Integer)list.get(1)).intValue());//提取
		System.out.println(list.set(1,new Student("赵六")));//替换
		list.add(1,2);//添加，后面的往后移动。
		System.out.println(((Integer)list.remove(1)).intValue());//移除并且返回对象。
		System.out.println(list.indexOf(new Student("张三"))); //查找指定元素的索引，找不到返回 -1.
		System.out.println(list.indexOf(123));
		System.out.println(list.lastIndexOf(123));
		
		List list2 = new LinkedList();
		list2.add("aaaa");
		list2.add("bbbb");
		list2.add("cccc");
		System.out.println("==============linkedlist===========");
		System.out.println(list2.size());
		System.out.println(list2.get(1));
		Iterator itr = list2.iterator();
		while(itr.hasNext()){
			String str = (String) itr.next();
			System.out.println(str);
		}
		
		
	}

}

class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
	}
	public Student( String name) {
		super();
		this.name = name;
	}
	
	
}

