package nolan.util.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 测试List、Set、Map集合的遍历操作
 * 
 * 建议大家以后遍历容器时，List可以使用索引遍历，Set建议使用迭代器！
 *
 */
public class TestIterate {
	
	public static void testList(){
		List<Student>  list = new ArrayList<Student>();
		list.add(new Student("张三"));
		list.add(new Student("李四"));
		list.add(new Student("王五"));
		list.add(new Student("赵六"));
		
		//使用索引遍历
		for(int i=0;i<list.size();i++){
			Student stu = list.get(i);
			System.out.println(stu.getName());
		}
		
		//使用增强for循环
		for(Student stu:list){
			System.out.println(stu.getName());
		}
		
		//使用迭代器(这种方式既可以迭代List，也可以迭代Set)
		Iterator<Student> ite = list.iterator();
		while(ite.hasNext()){
			Student stu = ite.next();
			System.out.println(stu.getName());
		}
		
		for(Iterator<Student> ite2 = list.iterator();ite2.hasNext();){
			Student stu = ite2.next();
			System.out.println(stu.getName());
		}
	}
		

	public static void testSet(){
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("张三"));
		set.add(new Student("李四"));
		set.add(new Student("王五"));
		set.add(new Student("赵六"));
		
		//使用增强for循环
		for(Student stu:set){
			System.out.println(stu.getName());
		}
		
		//使用迭代器(这种方式既可以迭代List，也可以迭代Set)
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()){
			Student stu = iter.next(); //返回当前元素，并且让游标指向下一个！
			System.out.println(stu.getName());
		}
		for(Iterator<Student> iter2 = set.iterator();iter2.hasNext();){
			Student stu = iter2.next();
			System.out.println(stu.getName());
		}
	}
	
	public static void testMap(){
		Map<String,Student>  map = new HashMap<String,Student>();
		map.put("a", new Student("张三"));
		map.put("b", new Student("李四"));
		map.put("c", new Student("王五"));
		
		//遍历key
		Set<String> set = map.keySet();
		for(Iterator<String> iter2 = set.iterator();iter2.hasNext();){
			String key = iter2.next();
			System.out.println(key+"---"+map.get(key).getName());
		}
		
		//遍历value
		Collection<Student> set2 = map.values();
		for(Iterator<Student> iter2 = set2.iterator();iter2.hasNext();){
			Student v = iter2.next();
			System.out.println(v.getName());
		}
		//遍历Entry(键值对)
		Set<Entry<String,Student>> set3 = map.entrySet();
		for(Iterator<Entry<String,Student>> iter2 = set3.iterator();iter2.hasNext();){
			Entry<String,Student> v = iter2.next();
			System.out.println(v.getKey()+"---"+v.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		//testList();
		//testMap();
		
		List<String> list =  new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		
		for(String str1:list){
			System.out.println(str1);
			for(String str2:list){
				System.out.println(str2);
			}
			
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