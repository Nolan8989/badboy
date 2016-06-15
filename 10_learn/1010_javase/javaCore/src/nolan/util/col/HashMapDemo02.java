package nolan.util.col;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 以面向对象的思路分析
 * @author Administrator
 *
 */
public class HashMapDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this is a cat and that is a mice where is the food";
		//统计每个单词出现的次数 ，打印显示  this -->1  is -->3	
		Map<String,Letter> map = new HashMap<String,Letter>();
		String[] strs= str.split("\\s+");
		for(String temp : strs ){
//			System.out.println(strTemp);
			Letter letter = map.get(temp);
			/*
		 	if(letter == null){
			letter = new Letter(temp);
			map.put(temp, letter);
			}
			letter.setCount(letter.getCount()+1);
			*/
			
			/*
			if(null==letter){
				letter =new Letter(temp,1); //创建容器同时放入值
				//放入map中
				map.put(temp, letter);
			}else{
				letter.setCount(letter.getCount()+1);
			}
			*/
			
			if(null==letter){
				letter =new Letter(temp,1); //创建容器同时放入值
			}else{
				letter.setCount(letter.getCount()+1);
			}			
			//放入map中
			map.put(temp, letter);
		}
		
		
		
		
		
		
		//遍历 只遍历值
		Collection<Letter> le = map.values();
		for(Letter l:le){
			System.out.println(l);
		}

	}

}

class Letter{
	private String name;
	private int count;
	public Letter(String name) {
		super();
		this.name = name;
	}
	public Letter(String name, int count) {
		this(name);
		this.count = count;
	}
	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Letter [name=" + name + ", count=" + count + "]";
	}
	
	
}
