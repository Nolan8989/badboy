package norlando.usually.Integer;

/**
 * ���԰�װ��Ļ����÷�
 *
 */
public class TestInteger {
	public static void main(String[] args) {
		//�����������ͺͰ�װ���ת��
		Integer i = new Integer(234);
		int i4 = i.intValue();
		
		
		//��װ����ַ������໥ת��
		System.out.println(Integer.toString(i));
		System.out.println(i.toString());//�ڲ����õ�toString(value);
//		System.out.println(""+i); 
		Integer i2 = new Integer("345");
		
//		Integer i3 = Integer.parseInt("frt");  //java.lang.NumberFormatException: For input string: "frt"
		
		
		
		//�Զ�װ��Ͳ���(�������������������ش���)
		Integer m = 32;   //װ�䡣  �����������������ӣ�new Integer(32);
		int n = new Integer(324);   //���䡣  ����������������ӣ�new Integer(324).intValue();
		
		Integer a = new Integer(123);
		Integer b = new Integer(123);
		System.out.println(a==b);    //false
		System.out.println(a.equals(b)); 
		
		
		//���⻰���Զ�װ��Ͳ���ʱ������[-128,127]֮�������Ϊ�����Ч�ʣ�����л��洦��
		Integer a2 = 123;
		Integer b2 = 123;
		System.out.println(a2==b2);   //true
		
	}
}


class MyInteger /*extends Number */{
	int value;

	public MyInteger(int value){
		this.value = value;
	}
	
}