package nolan.base;
public  class TestIf {

	public static void main(String[] args) {
		double d = Math.random();
		int i = 1 + (int) (d * 6);
		System.out.println(i);
		
		if(i==6){
			System.out.println("it's luck too much");
		}else if(i>=4){
			System.out.println("it's good luck");
		}else if (i>=2){
			System.out.println("it's bad");
		}else {
			System.out.println("it's misfortune ");
		}
		
		
		double r = 4*Math.random();
		double area = Math.PI * Math.pow(r, 2);
		double circle = 2 * Math.PI * r;
		System.out.println("�뾶Ϊ��" + r );
		System.out.println("���Ϊ��" + area );
		System.out.println("�ܳ�Ϊ��" + circle );
		if (area > circle){
			System.out.println("��������ܳ�");
		}else if (area < circle){
			System.out.println("���С���ܳ�");
		}
		
		int age = (int)(100 * Math.random());
		System.out.print("�����ǣ�"+ age+"���ڣ�");
		if(age <15){
			System.out.println("��ͯ��ϲ����ˣ");
		}else if(age < 25){
			System.out.println("���꣬Ҫѧϰ��");
		}else if(age <45){
			System.out.println("���꣬Ҫ������");
		}else if(age <65){
			System.out.println("������Ҫ����");
		}else if(age <85){
			System.out.println("���꣬���˶�");
		}else{
			System.out.println("�����ǣ�����ϡ");
		}
		
		int score = (int)(101*Math.random());
		System.out.println(score);
		if(score >= 90 && score <=100){
			System.out.println("����");
		}else if(score >=80){
			System.out.println("����");
		}else if(score >=60){
			System.out.println("����");
		}else if(score >=30){
			System.out.println("������");
		}else{
			System.out.println("���ϸ�ָ��");
		}
	
		char c = 'a';
		int rand = (int)(26 * Math.random());
		char c2 = (char)(c + rand);
		System.out.println(c2);
		if(c2 == 'a'||c2 =='e'||c2 =='i'||c2 =='o'||c2 =='u'){
			System.out.println("Ԫ��");
		}else if(c2 =='w'||c2 =='y'){
			System.out.println("��Ԫ��");
		}else{
			System.out.println("����");
		}
		
	}
	
}
