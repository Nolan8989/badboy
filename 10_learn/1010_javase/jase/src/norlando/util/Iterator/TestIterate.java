package norlando.util.Iterator;

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
 * ����List��Set��Map���ϵı�������
 * 
 * �������Ժ��������ʱ��List����ʹ������������Set����ʹ�õ�������
 *
 */
public class TestIterate {
	
	public static void testList(){
		List<Student>  list = new ArrayList<Student>();
		list.add(new Student("����"));
		list.add(new Student("����"));
		list.add(new Student("����"));
		list.add(new Student("����"));
		
		//ʹ����������
		for(int i=0;i<list.size();i++){
			Student stu = list.get(i);
			System.out.println(stu.getName());
		}
		
		//ʹ����ǿforѭ��
		for(Student stu:list){
			System.out.println(stu.getName());
		}
		
		//ʹ�õ�����(���ַ�ʽ�ȿ��Ե���List��Ҳ���Ե���Set)
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
		set.add(new Student("����"));
		set.add(new Student("����"));
		set.add(new Student("����"));
		set.add(new Student("����"));
		
		//ʹ����ǿforѭ��
		for(Student stu:set){
			System.out.println(stu.getName());
		}
		
		//ʹ�õ�����(���ַ�ʽ�ȿ��Ե���List��Ҳ���Ե���Set)
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()){
			Student stu = iter.next(); //���ص�ǰԪ�أ��������α�ָ����һ����
			System.out.println(stu.getName());
		}
		for(Iterator<Student> iter2 = set.iterator();iter2.hasNext();){
			Student stu = iter2.next();
			System.out.println(stu.getName());
		}
	}
	
	public static void testMap(){
		Map<String,Student>  map = new HashMap<String,Student>();
		map.put("a", new Student("����"));
		map.put("b", new Student("����"));
		map.put("c", new Student("����"));
		
		//����key
		Set<String> set = map.keySet();
		for(Iterator<String> iter2 = set.iterator();iter2.hasNext();){
			String key = iter2.next();
			System.out.println(key+"---"+map.get(key).getName());
		}
		
		//����value
		Collection<Student> set2 = map.values();
		for(Iterator<Student> iter2 = set2.iterator();iter2.hasNext();){
			Student v = iter2.next();
			System.out.println(v.getName());
		}
		//����Entry(��ֵ��)
		Set<Entry<String,Student>> set3 = map.entrySet();
		for(Iterator<Entry<String,Student>> iter2 = set3.iterator();iter2.hasNext();){
			Entry<String,Student> v = iter2.next();
			System.out.println(v.getKey()+"---"+v.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		//testList();
		testMap();
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