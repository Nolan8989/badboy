package norlando.base;
/*
 * break ����������ǰѭ��ѭ����
 * Continue ��ָĳ��ѭ�� �����´�
 */
public class TestBreakContinue {
	public static void main(String args[]){
		System.out.println("##############TestBreak 1#############");
		int total = 0;
		System.out.println("Begin");
		while (true) {
			total++;
			int i = (int) Math.round(100 * Math.random());
			if (i == 88) {
				break;
			}
		}
		System.out.println("Game over, used " + total + " times.");
		System.out.println("##############TestBreak 2#############");
		for(int I = 1;I<=3;I++){
			for(int i = 1; i<=5; i++){
				if(i == 2){
					break; //break������������ѭ��������Ӱ�������ѭ����
				}
				System.out.println(i);
			}
		System.out.println("big I system out:" + I);	
		}
		System.out.println(Math.round(3.54));	
		
		System.out.println("##############TestContinue 1#############");
		for (int i = 100; i < 115; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("##############TestContinue 2#############");
		outer: for (int i = 101; i < 150; i++) {
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0)
					continue outer;
			}
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("##############TestContinue 3 #############");
//		��������break ��������� ����ǩ��Continue��
		 for (int i = 101; i < 150; i++) {
			int k = 0;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0){
					k = 1;
					break;
				}
				}
				if (k == 0){
					System.out.print(i + "  ");
				}
			}
			
		
	}
}