package nolan.util.col;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

//google Collection    -->guava
//apache commons Collection 
public class HashMapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is a cat and that is a mice where is the food";
		//统计每个单词出现的次数 ，打印显示  this -->1  is -->3	
		str.trim();
		Map <String,Integer> map = new HashMap<String,Integer>();
		StringTokenizer tokenizer = new StringTokenizer(str," "); // 没有参数的默认调用this(str, " \t\n\r\f", false);
		while(tokenizer.hasMoreElements()){
			
			String strTemp = (String) tokenizer.nextElement();
			if(! map.containsKey(strTemp)){
				map.put(strTemp, 0);
			}
			map.put(strTemp, (map.get(strTemp) + 1));
		}
		
//		System.out.println(map);
		
		
//遍历map
		//1、keySet +get  foreach +迭代器(2种)
		 Set<String> key = map.keySet();
		 Iterator<String> itor = key.iterator();
		 System.out.println("=================foreach===============");
		 while(itor.hasNext()){
			 String s = itor.next();
			 System.out.println(s +" ===>"+ map.get(s));
		 }
		 System.out.println("=================foreach===============");
		 for(String s:key){
			 System.out.println(s +" ===>"+ map.get(s));
		 }
		 
		 
		//2、entrySet foreach +迭代器(2种)
			System.out.println("====entrySet=========iterator===========");
			Set<Map.Entry<String, Integer>> entry = map.entrySet();
			Iterator<Map.Entry<String, Integer>> itentry = entry.iterator();
			while(itentry.hasNext()){
				Map.Entry<String, Integer> me = itentry.next();
				System.out.println(me.getKey()+"===>"+me.getValue());
			}
			
			System.out.println("====entrySet=========foreach===========");
			
			for(Map.Entry<String, Integer> me : entry){
				System.out.println(me.getKey()+"===>"+me.getValue());
			}
			
			
			
			//只获取值 values foreach +迭代器(2种)
			Collection<Integer> cols =map.values();
			Iterator<Integer> ita = cols.iterator();
			while(ita.hasNext()){
				Integer s = ita.next();
				System.out.print(s+"\t");
			}
			
	}
	
	
	public static void store(){
		HashMap<Goods,String> map =new HashMap<Goods,String>();
		Goods goods1=new Goods("老高视频",10000,10000000);
		Goods goods2=new Goods("老高视频",20000,20000000);
		Goods goods3=new Goods("老高视频",0,1000);
		map.put(goods1, "a");
		map.put(new Goods("老高视频",10000,10000000), "b");
		map.put(new Goods("老高视频",10000,10000000), "c");
		System.out.println(map.size());
	}

	
}


class Goods implements Comparable<Goods>{
	//名称
	private String name;
	//价格
	private double price;
	//喜爱度
	private int fav;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fav;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (fav != other.fav)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}



	public Goods(String name, double price, int fav) {
		super();
		this.name = name;
		this.price = price;
		this.fav = fav;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	
	@Override
	public String toString() {
		return "商品名:"+this.name+",价格:"+this.price+",喜爱度:"+this.fav;
	}
	//按喜爱度  升序
	@Override
	public int compareTo(Goods o) {
		return -(this.fav-o.fav);
	}
	
}
