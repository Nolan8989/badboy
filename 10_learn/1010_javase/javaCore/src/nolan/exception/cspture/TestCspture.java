package nolan.exception.cspture;

public class TestCspture {

	
	public static void main(String[] args) {
		
		
		System.out.println(TestCspture.testcs());
		
	}
	
	
	public  static String testcs(){
		try{
			int[] a = new int[2];
			a[1]=1;
			System.out.println(a[2]);
			return "try";
		}catch(Exception e){
			int[] a = new int[2];
			a[1]=2;
			System.out.println(a[1]);
			return "catch";
		}finally{
			return "finally";
		}
		
	}
	
}
