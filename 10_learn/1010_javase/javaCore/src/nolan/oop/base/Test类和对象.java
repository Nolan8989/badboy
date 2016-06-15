package nolan.oop.base;



public class Test类和对象 {
	public static void main(String[] args) {
		//类是对象的模板。所以，某个类下面的对象都具备相同的结构！
		int i = 100;
		/*
		 * 类相当于开发商的图纸。我们的房子就是根据类这个图纸生成的。
		 * new Student()，会根据类这个图纸建好一个对象。这个对象具备了类里面所规定的结构。而且，所有属性被赋予默认值。
		 * 默认赋值规则是：数字默认是0，布尔值默认是false，引用类型默认是null。char类型默认是：\u0000
		 * 
		 * 我们可以根据自己的需求对对象的属性做不同的赋值处理。就像房子的具体装修一样。
		 */
		Student s1 = new Student();  //通过new来调用构造方法
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		s1.id=1001;
		s1.name="张三";
		s1.gender="男的";
		s1.score01=60;
		s1.score02=80;
		s1.score03=90;
		
		s1.study();
		
		Student s2 = new Student();
		s2.id=1002;
		s2.name="李四";
		s2.gender="女的";
		s2.score01=65;
		s2.score02=85;
		s2.score03=95;
		
		s2.study();
		
	}
}

/**
 * 课堂作业：
 * 1. 定义一个学生类。模仿老师代码。
 * 2. 定义一个老师类。属性和行为自己添加。
 * 
 */


