package nolan.oop.inherit;

import nolan.oop.inherit.entity.People;
import nolan.oop.inherit.entity.Student;
/**
 * ѧ����̳���������
 * ѧ������ ���� ���䣬��������Ĵ��������޸ĸ��� �������ࣿ
 * @author andong
 *
 */
public class ObjectExtends {

	public static void main(String[] args) {
		
		//����
		People persion1 =  new People();
		persion1.setAge("1");
		persion1.getAge();
		persion1.setHeight("1");
		persion1.getHeight();
		System.out.println("==========================================");
		
		
		//��̬
		People persion2 = new  Student();
		persion2.setAge("1");
		persion2.getAge();
		persion2.setHeight("1");
		persion2.getHeight();
		System.out.println("==========================================");
		//����
		Student student1 = new Student();
		student1.setAge("1");
		student1.getAge();
		student1.setHeight("1");
		student1.getHeight();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
