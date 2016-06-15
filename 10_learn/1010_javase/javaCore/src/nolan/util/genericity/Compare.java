package nolan.util.genericity;
/**
 * 接口 公共的特殊的抽象类
 * 1、公共的抽象方法
 * 2、全局的静态常量 
 * 
 * 泛型接口与实现类,重写的方法类型随 接口而定
 * 1、接口与实现同为泛型
 * 2、接口指定具体的类型
 * 3、实现类泛型，接口擦除
 * 4、实现类与接口同时擦除
 * @author Administrator
 *
 * @param <T>
 */
/*public abstract*/interface Compare<T> {
	/*public static final*/ double MAX_VALUE=90;
	/*public abstract */void compare(T t1,T t2);
}
/**
 * 接口与实现类同为泛型,
 * 使用类时确定类型，同时实现类可以增加类型
 * @author Administrator
 *
 * @param <T>
 */
class A<T,T1> implements Compare<T>{

	@Override
	public void compare(T t1, T t2) {
		// TODO Auto-generated method stub
		
	}
	
}
/**
 * 接口指定具体的类型
*/
class B implements Compare<String>{
	@Override
	public void compare(String t1, String t2) {		
	}	
}
/**
 *实现类泛型，接口擦除
 */
class C<T> implements Compare{

	@Override
	public void compare(Object t1, Object t2) {
		
	}
}
/**
 *实现类与接口同时擦除
 */
class D implements Compare{

	@Override
	public void compare(Object t1, Object t2) {
		
	}
}
/**
 *错误:实现类擦除，接口泛型
 *class E implements Compare<T>{

	@Override
	public void compare(T t1, T t2) {
		
	}
}
 */
