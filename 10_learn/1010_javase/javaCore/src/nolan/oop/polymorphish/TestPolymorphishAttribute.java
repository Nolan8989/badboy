package nolan.oop.polymorphish;
/**
 * ���Բ��ᷢ����̬��
 * @author Administrator
 *
 */
public class TestPolymorphishAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.l =1;//����ı����a��l����ֵ��
		a.name = "abc";//����ı����a��name����ֵ��
		System.out.println(a.getL());//������̬�����õ���b��getL();
		System.out.println(a.getName());//������̬�����õ���b��getName();
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
