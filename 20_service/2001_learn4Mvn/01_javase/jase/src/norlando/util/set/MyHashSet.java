package norlando.util.set;


import java.util.HashMap;

/**
 * �Զ����Լ���HashSet
 * @author Administrator
 *
 */
public class MyHashSet<K> {

	HashMap<K,Object> map;
	private static final Object PRESENT = new Object();

	public MyHashSet(){
		map = new HashMap<>();//����new��ʱ��Ҫ��<>;
	}
	
	public int size(){
		return map.size();
	}
	
	public boolean add(K k){
		return map.put(k, PRESENT) == null;   //set�Ĳ����ظ�����������map���������Ĳ����ظ���
		
	}
	
	public static void main(String[] args) {
		MyHashSet<String> s = new MyHashSet<String>();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
	}

}
