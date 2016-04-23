package norlando.util.map;

import java.util.Map;
import java.util.HashMap;

/**
 * ����Map�Ļ����÷�
 *1. Map��������ǳɶԴ�ţ�key��value��
 *2. MapȡValue����ʱ����ͨ��key������ȡ��
 *3. key�������ظ���(�˴����ظ�ָ���ǣ�equals��hashcode)
 *
 *
 */
@SuppressWarnings("all")
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		Map map2 = new HashMap();
		Student1 stu1 = new Student1("����");
		
		map.put("a", new Student1("����"));
		map.put("a", new Student1("����"));   //���key��ͬ������и��ǣ�
		map.put(stu1, new Student1("��С��"));
		
		
		map2.put(1, 30);
		map2.put(2, 18);
		
		Student1 stu = (Student1) map.get("a");
		System.out.println(stu.getName());
		Student1 stu2 = (Student1) map.get(stu1);
		System.out.println(stu2.getName());
		
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsKey(new Student1("����")));
		
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
