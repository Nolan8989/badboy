package nolan.usuallyclass.string;

import java.util.ArrayList;

/**
 * 模拟实现JDK中提供的ArrayList类
 * 
 * 作业：
 * 		晚上完成自定义的ArrayList
 *
 */
public class MyArrayList {
	/**
     * The value is used for object storage.
     */
    private Object[] value;

    /**
     * The size is the number of objects used.
     */
    private int size;
    
    public MyArrayList(){
    	
    }
    
    public MyArrayList(int size){ //判断：小于零抛异常，不小于就
    	if(size < 0){
    		try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	 value = new Object[size];
    }
    
    public int size(){
    	return size;
    }
    
    public boolean isEmpty() {
       return size == 0;
    }
    
    public void add(Object obj){
    	value[size] = obj;
    	size++;
    	if(size >=value.length){
    		int newCapacity = value.length*2;
    		Object[] newList = new Object[newCapacity];
    		for(int i=0;i<value.length;i++){
    			newList[i] = value[i];
    		}
    		value =newList;
    	}
    }
    
    public Object get(int index){
    	if(index < 0 &&index >value.length){
    		try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return value[index];
    	
    }
    
    public int indexOf(Object obj){
    	if(obj == null){
    		return -1;
    	}else{
    		for(int i=0;i<value.length;i++){
    			if(obj == value[i]){
    				return i;
    			}
    	}
    		return -1;
    	}
    }
    
    public int lastIndexOf(Object obj){
    	if(obj == null){
    		return -1;
    	}else{
    		for(int i=value.length; i>=0;i--){
    			if(obj == value[i]){
    				return i;
    			}
    	}
    		return -1;
    	}
    }
    
    public void set(int index, Object object) {
    	if(index < 0 && index >value.length&&object == null){
    		try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		value[index] = object;
    	}
    	
    }
    

    
    
    public static void main(String[] args) {
		MyArrayList  list = new MyArrayList(2);
		
		list.add("00000");
		list.add(new Man("高琪"));
		list.add("22222");
		list.add("33333");
		list.add("44444");
		list.add("55555");
		System.out.println(list.indexOf(new Man("高琪")));
		
		Man h = (Man) list.get(1);
		System.out.println(h.getName());
		
		System.out.println(list.get(3)); 
		System.out.println(list.size());
		
	}
    
}


class Man {
	private String name;

	public Man(String name) {
	super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

