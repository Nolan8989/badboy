package nolan.util.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class InnerDemo01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("中学堂");
		list.add("国中");
		list.add("中京");		
		Collections.sort(list, new StringComp());
		
		System.out.println(list);
		
		
		List<Goods> goods =new ArrayList<Goods>();
		Goods goods1=new Goods("老高视频",10000,10000000);
		Goods goods2=new Goods("老高视频",20000,20000000);
		Goods goods3=new Goods("老高视频",0,1000);
		
		//Goods[] goodArr ={goods1,goods2,goods3};
		goods.add(goods1);
		goods.add(goods2);
		goods.add(goods3);
		
		Util.sort(goods, new GoodsComp());
		System.out.println(goods);
		
		
		
		
		List<Person> people=new ArrayList<Person>();
		people.add(new Person("小强",9527));
		people.add(new Person("旺财",9528));
		Collections.sort(people, new PersonComp());		
		System.out.println(people);
		
		
		
	}
	
	public static void test1(){
		//升序排序
		String[] arr ={"尚学堂","中国","北京"};
		System.out.println(Arrays.toString(arr));
		
		Date[] arr2 ={new Date(),new Date(System.currentTimeMillis()-10000),new Date(System.currentTimeMillis()+100000)};
		
		Util.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		//自定义类型
		Goods goods1=new Goods("老马视频",10000,10000000);
		Goods goods2=new Goods("老高视频",20000,20000000);
		Goods goods3=new Goods("老裴视频",0,1000);
		
		//Goods[] goodArr ={goods1,goods2,goods3};
		List<Goods> list =new ArrayList<Goods>();
		list.add(goods1);
		list.add(goods2);
		list.add(goods3);
		//Util.sort(list);
		Collections.sort(list);
		for(Goods t:list){
			System.out.println(t);
		}
				
				
		//Collections 工具类
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

class Person {
	private String name;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
