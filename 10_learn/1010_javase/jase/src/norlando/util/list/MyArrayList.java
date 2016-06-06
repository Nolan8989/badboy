package norlando.util.list;

import java.util.ArrayList;
import java.util.List;


/**
 * 自己实现一个ArrayList，帮助我们更好的理解ArrayList类的底层结构！
 * ArrayList底层实现说明：
 * 1. 使用Object数组来存储数据
 * 2. 元素数量可以无限制的存储。底层实现是数组的扩容(实际是通过定义新的、长度更大的数组，将旧数组的内容copy到新数组中即可)
 * 3. 优势：查询速度
 * 4. 劣势：修改、增加、删除、较慢。
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
	 * 构造一个长度为initialCapacity的Object 数组。
	 * 如果输入的长度小于0，抛出异常。
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
		//数组扩容和数据的拷贝
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
