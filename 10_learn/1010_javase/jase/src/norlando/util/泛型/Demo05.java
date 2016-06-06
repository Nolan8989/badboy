package norlando.util.泛型;

import java.util.List;

public class Demo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//声明
		List<String>[] arr ;
		//没有泛型数组
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
