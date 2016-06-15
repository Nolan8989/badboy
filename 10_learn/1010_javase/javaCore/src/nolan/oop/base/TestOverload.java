package nolan.oop.base;

public class TestOverload {
	
	
	public int add(int a,int b){
		return a+b;
	}
	
//	public double add(int a,int b){   //返回值不同，不构成重载！
//		return a+b;
//	}
	
	
//	public int add(int c,int d){   //形参名称不同，不构成重载！
//		return c+d;
//	}
	
	public int add(double a,int b){
		return (int)(a+b);
	}
	
	public int add(int a,double b){
		return (int)(a+b);
	}
	
	public int add(int a,int b,int c){
		return a+b+c;
	}
	
	
	
	
	public static void main(String[] args) {
		TestOverload t = new TestOverload();
		int c = t.add(3,6);
		int c2 = t.add(3,6,8);
		
		System.out.println(c); 
	}
	
}
