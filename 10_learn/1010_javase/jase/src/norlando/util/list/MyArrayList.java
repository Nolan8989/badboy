package norlando.util.list;

import java.util.ArrayList;
import java.util.List;


/**
 * �Լ�ʵ��һ��ArrayList���������Ǹ��õ����ArrayList��ĵײ�ṹ��
 * ArrayList�ײ�ʵ��˵����
 * 1. ʹ��Object�������洢����
 * 2. Ԫ���������������ƵĴ洢���ײ�ʵ�������������(ʵ����ͨ�������µġ����ȸ�������飬�������������copy���������м���)
 * 3. ���ƣ���ѯ�ٶ�
 * 4. ���ƣ��޸ġ����ӡ�ɾ����������
 * @author Administrator
 *
 */
public class MyArrayList {

	private Object[] elementData;
	private int size;
	
	
	public MyArrayList(){
		this(10);
	}
	/**
	 * ����һ������ΪinitialCapacity��Object ���顣
	 * �������ĳ���С��0���׳��쳣��
	 */
	public MyArrayList(int initialCapacity){
		if(initialCapacity < 0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.elementData = new Object[initialCapacity];
	}
	
	public boolean isEmpty(){
		return size == 0 ;
	}

	public int size(){
		return size;
	}

	public void add(Object obj){
		//�������ݺ����ݵĿ���
		ensureCapacity();
		elementData[size++] = obj;
		
	}
	
	public void add(int index,Object obj){
		ensureCapacity();
		System.arraycopy(elementData, index, elementData, index+1, size-index -1);
		elementData[index] = obj;
	}
	public Object set(int index,Object obj){
		rangeCheck(index);
		Object oldElementData = elementData[index];
		elementData[index] = obj;
		return oldElementData;
	}
	public Object get(int index){
		rangeCheck(index);
		return elementData[index];
	}
	
	public void remove(int index){
		rangeCheck(index);
		int numMoved = size - index - 1;
		if(numMoved > 0){
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
		if(numMoved >= 0){
			elementData[--size] = null;
		}
	}

	public void remove(Object obj){
		for(int i=0; i<size;i++){
			if(obj.equals(this.get(i))){
				this.remove(i);
			}
			
		}
	}
	
	 public int indexOf(Object obj){
		 for(int i=0; i<size;i++){
				if(obj.equals(this.get(i))){
					return i;
				}
		 }
		 return -1;
	}
	 
	 public int lastIndexOf(Object obj){
		 for(int i=size-1; i>=0;i--){
				if(obj.equals(this.get(i))){
					return i;
				}
		 }
		 return -1;
	}
	
	private void ensureCapacity(){
		if(size == elementData.length){
			Object newArray[] = new Object[size*2];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
	}
	
	
	private void rangeCheck(int index){
		if(index < 0 || index >= size){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList();
		ma.add("abc");
		System.out.println(ma.size());
		//ma.remove(0);
		//ma.remove("abc");
		System.out.println(ma.lastIndexOf("abc"));
		//System.out.println(ma.size());
		//List list  = new ArrayList();
		//list.add(123);
		
	}

}
