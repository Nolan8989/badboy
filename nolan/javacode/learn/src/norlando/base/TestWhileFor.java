package norlando.base;

/**
 * while��forѭ�������ϰ��Ŀ
 * @author dell
 *
 */
public class TestWhileFor {
	public static void main(String[] args) {
		int oddSumFor = 0;  //�������������ĺ�
		int oddSumWhile = 0;  //�������������ĺ�
		int evenSumFor = 0;  //�������ż���ĺ�
		int evenSumWhile = 0;  //�������ż���ĺ�
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
		System.out.println("For�������1-100�����ĺͣ�"+oddSumFor); 
		System.out.println("While�������1-100�����ĺͣ�"+oddSumWhile); 
		System.out.println("For�������1-100ż���ĺͣ�"+evenSumFor); 
		System.out.println("While�������1-100ż���ĺͣ�"+evenSumWhile); 
		
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
