package norlando.util.fanxing;

import java.util.List;

public class Demo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����
		List<String>[] arr ;
		//û�з�������
		//arr =new ArrayList<String>[9];
		MyArrayList<String> list =new MyArrayList<String>();
		list.add("a");
		System.out.println(list.get(0));	
	}

}
class MyArrayList<E>{
	private Object[] container=new Object[10];
	private int size =0;
	
	public E get(int idx){
		return (E)container[idx];
	}
	public void add(E elem){
		container[size++] =elem;
	}
	
	
}
