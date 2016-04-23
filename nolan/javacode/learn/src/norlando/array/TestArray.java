package norlando.array;

/**
 * 测试数组的基本用法
 * 数组：是相同数据类型的有序集合。
 * 		数组也是对象！数组中的元素相当于对象的成员变量！
 * 		数组中的元素，可以通过下标(索引)来访问，索引范围：[0,length-1]！不在此范围则报异常：java.lang.ArrayIndexOutOfBoundsException
 * JAVA中，数组的长度的确定的！不可改变的！
 * 
 * 数组的初始化：
 * 1. 默认初始化
 * 		规则跟成员变量的默认初始化规则一致！数字0，布尔false，char是\u0000，引用类型null
 * 2. 动态初始化
 * 	  根据索引下标初始化！
 * 3. 静态初始化
 * 
 */
public class TestArray {
	
	public static void main(String[] args) {
		int[]  a = new int[4];		//int  b[] = new int[4];
		int [] k;
		a[0] = 123;
		a[1] = 34;
		a[2] = 43;
		a[3] = 66;
		//简单的数组遍历
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
//			a[i] = i*10;
		}
		
		
		//静态初始化
		int b[] = {4,6,8,10,30};

		
		
		//数组的长度不可变。索引不能超过length-1.
		int[] c = new int[3];
		c[0] = 11;
		c[1] = 22;
		c[2] = 33;
		
		//报错  java.lang.ArrayIndexOutOfBoundsException: 
	    //c[3] = 44;   
		
		//对象数组
				Student students[] = {
										new Student("张三"),
										new Student("李四"),
										new Student("王五"),
										new Student("赵六")
									};
			
				System.out.println(students[0].getName());
				
				int scores[] = {90,99,85,95};
				
				students[0].setScore(scores);
				
				System.out.println(students[0].getScore()[0]);
	}
	

}

class Student {
	private int id;
	private String name;
	
	private int[]  score;
	//score[0],score[1],...

	public Student(String name) {
		this.name = name;
	}

	
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

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}
	
	
	
	
}