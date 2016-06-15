import java.util.ArrayList;
import java.util.List;


public class Test {
	private int id ;
	private String name ; 
	
	
	
	public Test method1(){
		
		System.out.println("调用了方法1...");
		return this ; 
	}
	
	public Test method2(){
		System.out.println("调用2...");
		return this;
	}
	
	
	 
	
	 public static void main(String[] args) {
		
		 //new Test().method1().method2();
		 	
		 //StringBuffer s = new StringBuffer();
		 //s.append("1").append("2");
		 
		 
	}
}
