package nolan.usuallyclass.file;

/**
 * 测试递归算法
 *
 */
public class TestRecursion {
	static int a = 0;
	
	public static void test01(){
		a++;
		System.out.println("test01:"+a);
		if(a<=3){  //递归体
			test01();
		}else{      //递归头
			System.out.println("over");
		}
	}
	
	public static void test02(){
		System.out.println("TestRecursion.test02()");
	}
	
	public static void main(String[] args) {
//		test01();
		System.out.println(factorial(10));  
	}	
	
	public static long factorial(int n){
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	

}
