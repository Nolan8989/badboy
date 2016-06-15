package nolan.util.Iterator;

import java.util.Iterator;

public class MyArrayListApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyArrayList3 list =new MyArrayList3();			
		Iterator<String> it1 =list.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("===============");
		it1 =list.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		System.out.println("===============");
		for(String temp:list){
			System.out.println(temp);
		}
	}

}
