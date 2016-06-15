package nolan.oop.inherit;

import nolan.oop.inherit.entity.People;
import nolan.oop.inherit.entity.Student;
/**
 * 学生类继承人类特性
 * 学生和人 都有 年龄，如果给更改此属性是修改父类 还是子类？
 * @author andong
 *
 */
public class ObjectExtends {

	public static void main(String[] args) {
		
		//父类
		People persion1 =  new People();
		persion1.setAge("1");
		persion1.getAge();
		persion1.setHeight("1");
		persion1.getHeight();
		System.out.println("==========================================");
		
		
		//多态
		People persion2 = new  Student();
		persion2.setAge("1");
		persion2.getAge();
		persion2.setHeight("1");
		persion2.getHeight();
		System.out.println("==========================================");
		//子类
		Student student1 = new Student();
		student1.setAge("1");
		student1.getAge();
		student1.setHeight("1");
		student1.getHeight();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
