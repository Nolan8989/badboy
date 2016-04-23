package norlando.util.map;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap{
	List arr [] = new LinkedList[9];
	private int size;
	
	public int size(){
		return size;
	}
	
	public void  put(Object key,Object value){  
		MyEntry  me = new MyEntry(key,value);
		int index = key.hashCode() % arr.length;
		List<MyEntry> list ;
		if(arr[index] == null){
			list = new LinkedList<MyEntry>();
			arr[index] = list;
		}else{
			list = arr[index];
			for(int i=0; i<list.size();i++){ //如果值重复，修改value.
				MyEntry me2 = list.get(i);
				if(key.equals(me2.key)){//这里依然是多态，调用子类的equals方法。
					me2.value = value;
					return;
				}
			}
		}
		list.add(me);
		size++;
	}
	
	public Object get(Object key){
		int index = key.hashCode()%arr.length;
		List<MyEntry> list = arr[index];
		for(int i=0;i<list.size();i++){
			if(key.equals(list.get(i).key)){
				return list.get(i).value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key){
		int index = key.hashCode()%arr.length;
		List<MyEntry> list = arr[index];
		if(list == null){
			return false;
		}
		for(int i=0;i<list.size();i++){
			MyEntry me = list.get(i);
			if(key.equals(me.key)){
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		MyHashMap m = new MyHashMap();
		m.put("高琪", new Wife("杨幂"));
		m.put("高琪", new Wife("李四"));
		//m.put(new String("haha"), new Wife("李四"));
		Wife w = (Wife) m.get("高琪");
		System.out.println(w.name); 
		System.out.println(m.containsKey("高琪"));
		System.out.println(m.containsKey(new String("haha")));//这个是为了证明多态的存在。
		System.out.println(m.size());
		
	}
	
}

class MyEntry{
	Object key;
	Object value;
	public MyEntry(Object key,Object value){
		this.key = key;
		this.value = value;
	}
}

class Wife {
	String name;
	public Wife(String name){
		this.name  = name;
	}
}