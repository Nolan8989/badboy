package nolan.util.set;


import java.util.HashMap;

/**
 * 自定义自己的HashSet
 * @author Administrator
 *
 */
public class MyHashSet<K> {

	HashMap<K,Object> map;
	private static final Object PRESENT = new Object();

	public MyHashSet(){
		map = new HashMap<>();//这里new的时候要加<>;
	}
	
	public int size(){
		return map.size();
	}
	
	public boolean add(K k){
		return map.put(k, PRESENT) == null;   //set的不可重复就是利用了map里面键对象的不可重复！
		
	}
	
	public static void main(String[] args) {
		MyHashSet<String> s = new MyHashSet<String>();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
	}

}
