package norlando.usually.string;

import java.util.StringTokenizer;

/**
 * test:String�Ļ����÷�
 *  ��ҵ��
 *  1. ������ҵ������������д����text:�����ҳ���ȥ��String���Դ�롣��������������û��ϵ���������õ�ϰ�ߡ�
 *  2. �����ҵ��ѧ��������ͬѧ�����Գ����Լ�д����MyString 
 *
 *
 * �ַ������÷��� :���ɸı���ַ�����
 * 1�� == equals
 * 2��������
 * 3��intern
 * 4��+ ƴ�� ������������������
 * 5��String() 
 *   String(String original) 
 * 6���ֽ��������ַ���ת��
 *    String(byte[] bytes, int offset, int length)   
 *    //�ֽ� -->�ַ�  ����
 *    String(byte[] bytes, int offset, int length, String charsetName)  *    
 *    getBytes() 
 *    //����
 *    getBytes(String charsetName) 
 * 7���ַ��������ַ���ת��
 *    String(char[] value, int offset, int count)    
 * 8��charAt(int index)  ��ȡ��Ӧ�����ĵ����ַ�
      concat(String str)   ƴ��
      endsWith(String suffix)  ��β
      startsWith(String prefix) ��ͷ
      indexOf(String str)   �Ӵ���һ�γ��ֵ�λ��
      lastIndexOf(String str) �Ӵ����һ�γ��ֵ�λ��
      length()  ����
      matches(String regex)  ƥ������
      replace(char oldChar, char newChar)  �滻�ַ�������֧������
      replaceAll(String regex, String replacement) 
      split(String regex) -->�ָ��ַ���
	  substring(int beginIndex, int endIndex)  ��ȡ�Ӵ�
	  trim()  ȥ��ǰ��ո�
	  valueOf(Xxx b)  ����������  ת���ַ���  
	  
  9���ָ��ַ��� 
   1)��split()
   2)��StringTokenizer	 ��֧������  
	StringTokenizer(String str, String delim)  Ĭ��""
 * 
 * @author Administrator
 *
 */
public class TestString {

	public static void main(String[] args) {
		//���´��빲������1002�����󣡷ǳ��˷ѣ��Ժ���������ѭ������ʱ���Բ�Ҫʹ��String�࣡
		String str = new String("abcdefg");
		for(int i=0;i<1000;i++){
			str  = str + i;
		}
		
		
		String g1 = "Hello World!";
		String g2 = "Hello World!";
		String s1 = new String("Hello World!");
		String s2 = new String("Hello World!");
		boolean b1 = g1.equals(g2);
		boolean b2 = (g1==g2);
		boolean b3 = (s1.equals(s2));
		boolean b4 = (s1==s2);
		
		
		/**
		 * test:equals()�͡�==����equalsIgnoreCase();
		 */
		System.out.println("g1.equals(g2)�Ƿ���� ��" + (b1? "���":"�����"));
		System.out.println("g1 == g2�Ƿ���� ��" + (b2? "���":"�����"));
		System.out.println("s1.equals(s2)�Ƿ���� ��" + (b3? "���":"�����"));
		System.out.println("s1 == s2�Ƿ���� ��" + (b4? "���":"�����")); //�жϵ����ڴ��ַ��
		System.out.println("equalsIgnoreCase()���Դ�Сд �ж�HELLO��hello�Ƿ�equals �� " + "HELLO".equalsIgnoreCase("hello"));
		
		/**
		 * test:length();
		 */
		System.out.println( "g1�ĳ���Ϊ��" + g1.length());

		
		/**
		 * test:replace();
		 */
		String g1replace = g1.replace(' ' , '$');
		System.out.println("g1===>" + g1 +"\n"+ "g1replace===>" + g1replace);
		
		/**
		 * test: indexOf();
		 * ���Բ������֡��ַ����ַ������ַ����ַ��������Դ�ָ��λ���ң�
		 */
		System.out.println("�ҵ���һ��l��λ�� ��" + g1.indexOf("l"));
		System.out.println("�ӵ�4���ַ�֮���ҵ�l��λ�� ��" + g1.indexOf("l",3));
		System.out.println(g1.indexOf("ll"));
		/**
		 * test:statsWith();�Ƿ���ָ���ַ�����ͷ����Ҳ�����Լ�ָ������
		 * 		endsWith();
		 * ���ִ�Сд��
		 */
		System.out.println("startsWith=====>" + g1.startsWith("l",3));
		System.out.println("endsWith=====>" + g1.endsWith("ing"));
		
		/**
		 *test: charAt();
		 */
		char c = g1.charAt(6);
		System.out.println("g1��6���ַ�Ϊ:" + c);
		
		/**
		 * test: substring();
		 */
		System.out.println("substring====>" + g1.substring(2));
		System.out.println("substring====>" + g1.substring(5, 6));//��ͷ����β
		
		/**
		 * test:toUpperCase()/toLowerCase();
		 */
		System.out.println("toUpperCase====>" + g1.toUpperCase());
		System.out.println("toLowerCase====>" + g1.toLowerCase());
		
		/**
		 * test: trim();
		 */
		System.out.println("trim()ȥ��ͷ��β�Ŀո�" + " nihao ".trim());
		
		/**
		 * test: compareTo();
		 */
		System.out.println("compareTo() ���ֵ�˳��Ƚ������ַ���" + "a".compareTo("a"));
		
		
		/**
		 * test:  String's constructor
		 */
		char[] ar = {'a','b','c','d','e','f','g'};
		System.out.println(new String(ar)); //����Ϊ�ַ������֡�
		byte[] by = {97,98,99,100,101,102,103};
		System.out.println(new String(by));
		
		int a =1;
		String srr ="abc";
		srr = String.valueOf(a); // �ڲ����õ���Integer.toString(a);�ɴ˿ɼ���̬�����ĺô���
		System.out.println(srr);
		
		String ko = String.valueOf('c');
		
		String s="true"; 
		Boolean flag = Boolean.valueOf (s);
		
		test2();
		test1();
	}
	/**
	 * �������ӷ� +
	 */
	public static void test2(){
		//+ ����������������Ϊ  
		//������ 1�����ͼ��  2�� �Ż� ����|����ֵ   ���� ֱ��ȷ��ֵ
		//������:������������  ����ȷ��ֵ (����)
		System.out.println("=================test2===================");
		String str ="ab";//������
		String str1 ="a";
		String str2 ="b";		
		System.out.println(str ==(str1+str2)); // result : false;
		System.out.println(str ==("a"+"b")); // result : true;
		//����ֵ   �Ż�
		String str3 ="a"+"b"; //String str3 ="ab"; //������
		System.out.println(str ==str3);
		
		//final ����ȷ��
		final String str4="a";
		System.out.println(str==(str4+"b"));
		
		//final ֵ �����ڷ���,����ȷ��ֵ
	//	final String str5 =getValue();
	//	System.out.println(str==(str5+"b"));
	}

	public static void test1(){
		// == equals
		System.out.println("============test1=================");
		String str1 ="abc"; //������
		String str2 =new String("abc"); //����		
		System.out.println(str1 ==str2); //�Ƚϵ�ַ  false
		System.out.println(str1.equals(str2));//�Ƚ�����  true
		
		//������ ������  ��һ�η��룬���ڻ�ȡʹ��
		str1 ="abc";
		str2 ="abc";
		System.out.println(str1 ==str2); //result:true
		
		//intern ʼ�շ��س����صĵ�ַ
		str1 ="abc"; //������
		str2 =new String("abc"); //����		
		System.out.println(str1 == str2.intern()); //result:true
	}
	
	/**
	 * �ָ��ַ���
	 */
	public static void split(){		
		String str="this is a cat and that is a mice where is the food";	
		StringTokenizer token =new StringTokenizer(str," "); // java.util
		while(token.hasMoreElements()){
			System.out.println(token.nextElement());
		}
		
		
		
		/*
		String[] strArr =str.split("\\s+");
		for(String strTemp:strArr){
			System.out.println(strTemp);
		}*/
	}

	
}

