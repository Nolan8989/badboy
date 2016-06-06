package norlando.base;

/**
 * while和for循环后的练习题目
 * @author dell
 *
 */
public class TestWhileFor {
	public static void main(String[] args) {
		int oddSumFor = 0;  //用来保存奇数的和
		int oddSumWhile = 0;  //用来保存奇数的和
		int evenSumFor = 0;  //用来存放偶数的和
		int evenSumWhile = 0;  //用来存放偶数的和
		int whilea = 1;
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				oddSumFor += i;
			}else{
				evenSumFor += i;
			}
			
		}
		while(whilea<=100){
			if(whilea%2 != 0){
				oddSumWhile += whilea;
			}else{
				evenSumWhile += whilea;
			}
			whilea++;
		}
		System.out.println("For方法输出1-100奇数的和："+oddSumFor); 
		System.out.println("While方法输出1-100奇数的和："+oddSumWhile); 
		System.out.println("For方法输出1-100偶数的和："+evenSumFor); 
		System.out.println("While方法输出1-100偶数的和："+evenSumWhile); 
		
		System.out.println("#######################################################"); 
		
		for(int j = 1;j<=1000;j++){
			if(j%5==0){
				System.out.print(j+"\t");
			}
			if(j%(5*3)==0){
				System.out.println();
			}
		}
		System.out.println("\n#######################################################"); 
		int whilej  = 1;
		int k = 0;
		while(whilej<=1000){
			if(whilej%5==0){
				System.out.print(whilej + "\t");
				if(k%3==0){
					System.out.println(); 
				}
				k++;
			}
			whilej++;
		}
	}
}
