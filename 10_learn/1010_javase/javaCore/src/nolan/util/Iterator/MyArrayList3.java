package nolan.util.Iterator;

import java.util.Iterator;

/**
 * ������ʵ��  ������
 * @author Administrator
 *
 */
public class MyArrayList3 implements java.lang.Iterable<String> {
	private String[] elements={"a","b","c","d","e","s"};
	private int size =6; //ʵ�ʴ�С
	
	
	//�����ڲ� �����ڲ���     ������+��������  
	public Iterator<String> iterator(){
		
		return  new java.util.Iterator<String>(){		
			//ָ��
			private int coursor =-1;
			/**
			 * �ж��Ƿ������һ��Ԫ��
			 * @return
			 */
			public boolean hasNext(){
				if(coursor<size-1){ 
					return true;
				}
				return false;
			}
			/**
			 * ��ȡԪ�� ,�α����
			 */
			public String next(){
				return elements[++coursor];
			}
			@Override
			public void remove() {
				
			}
		};	
		
	}
	
}
