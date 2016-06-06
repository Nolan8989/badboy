package norlando.oop.base;

public class TestObject {
	public static void main(String[] args) {
		Man m  = new Man("张三");
		Man m2 = m;
		System.out.println(m);  //直接打印一个对象，默认就是调用了toString方法！
		System.out.println(m.toString());
		System.out.println(m==m2);
		System.out.println(m.equals(m2));
		
	}
}


class Man {
	String name;
	
	public Man(String name){
		this.name = name;
	}
	
	public String toString() {
		return "此人姓名："+name;
	}
	
}
