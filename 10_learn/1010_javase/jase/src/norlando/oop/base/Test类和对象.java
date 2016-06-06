package norlando.oop.base;



public class Test类和对象 {
	public static void main(String[] args) {
		//���Ƕ����ģ�塣���ԣ�ĳ��������Ķ��󶼾߱���ͬ�Ľṹ��
		int i = 100;
		/*
		 * ���൱�ڿ����̵�ͼֽ�����ǵķ��Ӿ��Ǹ��������ͼֽ���ɵġ�
		 * new Student()������������ͼֽ����һ�������������߱������������涨�Ľṹ�����ң��������Ա�����Ĭ��ֵ��
		 * Ĭ�ϸ�ֵ�����ǣ�����Ĭ����0������ֵĬ����false����������Ĭ����null��char����Ĭ���ǣ�\u0000
		 * 
		 * ���ǿ��Ը����Լ�������Զ������������ͬ�ĸ�ֵ���������ӵľ���װ��һ����
		 */
		Student s1 = new Student();  //ͨ��new�����ù��췽��
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		s1.id=1001;
		s1.name="����";
		s1.gender="�е�";
		s1.score01=60;
		s1.score02=80;
		s1.score03=90;
		
		s1.study();
		
		Student s2 = new Student();
		s2.id=1002;
		s2.name="����";
		s2.gender="Ů��";
		s2.score01=65;
		s2.score02=85;
		s2.score03=95;
		
		s2.study();
		
	}
}

/**
 * ������ҵ��
 * 1. ����һ��ѧ���ࡣģ����ʦ���롣
 * 2. ����һ����ʦ�ࡣ���Ժ���Ϊ�Լ���ӡ�
 * 
 */


