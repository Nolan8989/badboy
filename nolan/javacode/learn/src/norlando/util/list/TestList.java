package norlando.util.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


/**
 * ����List�еĻ�������
 * List�еķ�����Ϊ�����ࣺ
 * һ���Ǵ�Collection�м̳й����ģ��÷�����һ�£�
 * �ڶ�������ӵĸ�˳��������صķ�����(����ص���Ժ���ᣡ)
 *
 */
@SuppressWarnings("all")
public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(123);
		list.add(123);
		list.add(new Student("����"));
		list.add(new Student("����"));
		list.add(123);
		
		System.out.println(((Integer)list.get(1)).intValue());//��ȡ
		System.out.println(list.set(1,new Student("����")));//�滻
		list.add(1,2);//��ӣ�����������ƶ���
		System.out.println(((Integer)list.remove(1)).intValue());//�Ƴ����ҷ��ض���
		System.out.println(list.indexOf(new Student("����"))); //����ָ��Ԫ�ص��������Ҳ������� -1.
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

