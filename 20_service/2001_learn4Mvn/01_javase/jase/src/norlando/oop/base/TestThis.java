package norlando.oop.base;
/**
 * this ָ�ĵĵ�ǰ���󣬵�ǰnew�����Ķ���
 * @author Administrator
 *
 */
public class TestThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}

class A{
	A(){
		System.out.println(this);
	}
}

class B extends A{

	public B() {
		super();
		System.out.println(this);
	}
	
}

class C extends B{
	C(){
		System.out.println(this);
	}
}











