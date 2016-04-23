package norlando.oop.keywords;
/*
 * 
 * super���ܣ�ͨ��super���Ե��ø���Ĺ�����; 
 * 			��ͨ����Ҳ������super��û��˳��,���������ã�
 * ע�����	1.ϵͳÿ�ζ������๹������Ĭ�ϵ���super()������޲���!!! ��;
 * 			2.������в������췽������ͨ��super(�����б�)����ϵͳĬ�ϣ��ɴ˿�֪˵��������ֻ������һ��super();
 * 			3.�������ֻ��һ���в������췽����û���޲����Ĺ����������಻Ӧ�����޲������췽��
 * �������������޲����������е��ø����в���������������Ԥ��Ϊ�丳ֵ��,�����в����Ĺ��췽��Ӧ�����в����б��super(�����б�)���ǵ�super();
 */


public class TestSuper {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
	}
}



class Animal2 {
	String eye;
	String nose;
	String ear;
	
//	public Animal(){
//		System.out.println("Animal���޲������췽����");
//	}
	
	public Animal2(String eye,String ear){
		System.out.println("Animal�����������Ĺ��췽��");
	}
	
	public Animal2(String eye,String ear,String nose){
		System.out.println("Animal�����������Ĺ��췽��");
	}
	
	public void breath(){
		System.out.println("������");
	}	
	public void breath(int a){
		System.out.println("������");
	}	
	
	public void run(){
		System.out.println("�������ܣ�");
	}
	
	
}

class Dog extends Animal2 {
	


	public Dog(){
		//super(); //����Ĭ�ϵ�����һ�������޲������췽����
		super("eye","ear");
		super.eye = "yello";
		System.out.println("����һֻ����");
	}
	
	public Dog(String eye, String ear){
		//super(); //����Ĭ�ϵ�����һ�������޲������췽����
		super(eye,ear);
		System.out.println("DOG�������������췽��");
	}
	
	public Dog(String eye, String ear,String nose){
		super(eye,ear);
		System.out.println("DOG�������������췽��");
	}
	
	public void run(){
		super.breath();
		super.breath(18);
		super.run();
		System.out.println("�������ܣ�");
	}
	
	public void grewBone(){
		
		System.out.println("�й�ͷ��");
	}
	
	
	
}


