package nolan.util.map;

import java.util.Map;
import java.util.HashMap;

/**
 * 测试Map的基本用法
 *1. Map存放数据是成对存放，key、value。
 *2. Map取Value对象时，是通过key对象来取。
 *3. key对象不能重复！(此处的重复指的是：equals和hashcode)
 *
 *
 */
@SuppressWarnings("all")
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		Map map2 = new HashMap();
		Student1 stu1 = new Student1("李四");
		
		map.put("a", new Student1("张三"));
		map.put("a", new Student1("张叁"));   //如果key相同，则进行覆盖！
		map.put(stu1, new Student1("李小四"));
		
		
		map2.put(1, 30);
		map2.put(2, 18);
		
		Student1 stu = (Student1) map.get("a");
		System.out.println(stu.getName());
		Student1 stu2 = (Student1) map.get(stu1);
		System.out.println(stu2.getName());
		
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsKey(new Student1("张三")));
		
		System.out.println(map2.containsValue(2));
		System.out.println(map2.containsKey(1));
		System.out.println(map2.get(1)); 
		System.out.println(map2.remove(1)); 
		System.out.println(map.size());
		map.putAll(map2);
		System.out.println(map.size());
		map2.clear();
		System.out.println(map2.size());
		
		
		map.remove("a");

		
		
	}
}

class Student1 {
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
	
	public Student1() {
	}
	
	public Student1( String name) {
		super();
		this.name = name;
	}
	
	
}
