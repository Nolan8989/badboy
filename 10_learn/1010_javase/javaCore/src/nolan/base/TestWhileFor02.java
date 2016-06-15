package nolan.base;
/**
 * 测试控制语句练习
 * 
 * @author dell
 * 
 */
public class TestWhileFor02 {
	public static void main(String[] args) {
		
		_99();
		addAdd();
		addFactorial();
		lowerAndUpper();
		for (int i = 1,j = i+10; i < 5; i++ , j = i *2){
			System.out.println("i=" + i + "j=" + j);

		}
	}
	static void _99(){
		/*
		 * 九九乘法表
		 */
		for (int m = 1; m <= 9; m++) {
			for (int i = 1; i <= m; i++) {
				System.out.print(i + "*" + m + "=" + (i * m) + "\t");
			}
			System.out.println();
		}
	}
		
		static void addAdd(){
			
			/*
			 * 求1+(1+2)+(1+2+3)+...+(1+2+3+...+100);
			 */
			System.out.println("===========求1+(1+2)+(1+2+3)+...+(1+2+3+...+100)=========");
			int k =0;
			for (int i = 1; i<=100;i++){
				for(int j = 1; j<=i; j++){
					k +=j;
				}
			}
			System.out.println(k);
		}
		static void addFactorial(){
			
			System.out.println("======================求1到15的阶乘之和======================");
			int result =0;
			for (int i = 1; i<=15;i++){
				int temp = 1;
				for(int j = 1; j<=i; j++){
					temp *=j;
				}
				result += temp;
			}
			
			System.out.println(result);
		}
		
		static void lowerAndUpper(){
			
			System.out.println("================计算大小写字母个数==================");
			String str = "daaaaJKZ";
			int lowerNum = 0;
			int upperNum = 0;
			for (int i = 0; i <str.length();i++){
				char c = str.charAt(i);
				if(c>='a'&&c<='z'){
					lowerNum++;
				}else if( c >='A'&& c<='Z'){
					upperNum++;
				}
			}
			System.out.println("小写字母" + lowerNum + "个");
			System.out.println("大写字母" + upperNum + "个");
		}
		
		
		
		
		
		
		
	
}