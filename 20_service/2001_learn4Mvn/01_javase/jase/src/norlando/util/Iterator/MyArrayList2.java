package norlando.util.Iterator;

import java.util.Iterator;

/**
 * ������ʵ��  ������
 * @author Administrator
 *
 */
public class MyArrayList2 {
	private String[] elements={"a","b","c","d","e","s"};
	private int size =6; //ʵ�ʴ�С
	
	
	//�����ڲ��಻��ʹ�����η� (�ɼ���)
	public Iterator<String> iterator(){
		
		class MyIt implements java.util.Iterator<String>{		
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
		}
		
		
		
		return new MyIt();
	}
	
}
