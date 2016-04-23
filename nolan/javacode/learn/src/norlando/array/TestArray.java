package norlando.array;

/**
 * ��������Ļ����÷�
 * ���飺����ͬ�������͵����򼯺ϡ�
 * 		����Ҳ�Ƕ��������е�Ԫ���൱�ڶ���ĳ�Ա������
 * 		�����е�Ԫ�أ�����ͨ���±�(����)�����ʣ�������Χ��[0,length-1]�����ڴ˷�Χ���쳣��java.lang.ArrayIndexOutOfBoundsException
 * JAVA�У�����ĳ��ȵ�ȷ���ģ����ɸı�ģ�
 * 
 * ����ĳ�ʼ����
 * 1. Ĭ�ϳ�ʼ��
 * 		�������Ա������Ĭ�ϳ�ʼ������һ�£�����0������false��char��\u0000����������null
 * 2. ��̬��ʼ��
 * 	  ���������±��ʼ����
 * 3. ��̬��ʼ��
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
		//�򵥵��������
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
//			a[i] = i*10;
		}
		
		
		//��̬��ʼ��
		int b[] = {4,6,8,10,30};

		
		
		//����ĳ��Ȳ��ɱ䡣�������ܳ���length-1.
		int[] c = new int[3];
		c[0] = 11;
		c[1] = 22;
		c[2] = 33;
		
		//����  java.lang.ArrayIndexOutOfBoundsException: 
	    //c[3] = 44;   
		
		//��������
				Student students[] = {
										new Student("����"),
										new Student("����"),
										new Student("����"),
										new Student("����")
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