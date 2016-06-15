package nolan.usuallyclass.string;

/**
 * ����StringBuilder���ɱ��ַ�����
 *  String�����ɱ��ַ�����
 *  StringBuilder���ɱ��ַ����У��̲߳���ȫ��Ч�ʸ�. ����һ��������
 *  StringBuffer:�ɱ��ַ����У��̰߳�ȫ��Ч�ʵ�
 *  ��������ݣ���ʵ�����´���һ��������������飬���������е�����copy���������м��ɣ�
 *  
 *  
 *  //������ҵ���Լ�ʵ�����鿽�������������ڣ�System.arraycopy();
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("def");
		StringBuffer sbf = new StringBuffer("dde");
		sb.append("12").append("23");
		sb.append(123).append(true);
		
		for(int i=0;i<100;i++){
			sb.append(i);
		}
		
		System.out.println("######################");
		
		StringBuilder sb2 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		sb2.deleteCharAt(2);
		System.out.println(sb2);
//		sb2.delete(2, 5);
		sb2.reverse();
		System.out.println(sb2);

		
		
		
	}
}
