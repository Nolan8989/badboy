package nolan.oop.polymorphish;
/**
 * 属性不会发生多态。
 * @author Administrator
 *
 */
public class TestPolymorphishAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.l =1;//这里改变的是a的l属性值。
		a.name = "abc";//这里改变的是a的name属性值。
		System.out.println(a.getL());//方法多态，调用的是b的getL();
		System.out.println(a.getName());//方法多态，调用的是b的getName();
	}

}

abstract class A {
	int l;
	String name;
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class B extends A{
	int l;
	String name;
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
