package norlando.util.fanxing;
/**
 * �ӿ� ����������ĳ�����
 * 1�������ĳ��󷽷�
 * 2��ȫ�ֵľ�̬���� 
 * 
 * ���ͽӿ���ʵ����,��д�ķ��������� �ӿڶ���
 * 1���ӿ���ʵ��ͬΪ����
 * 2���ӿ�ָ�����������
 * 3��ʵ���෺�ͣ��ӿڲ���
 * 4��ʵ������ӿ�ͬʱ����
 * @author Administrator
 *
 * @param <T>
 */
/*public abstract*/interface Compare<T> {
	/*public static final*/ double MAX_VALUE=90;
	/*public abstract */void compare(T t1,T t2);
}
/**
 * �ӿ���ʵ����ͬΪ����,
 * ʹ����ʱȷ�����ͣ�ͬʱʵ���������������
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
 * �ӿ�ָ�����������
*/
class B implements Compare<String>{
	@Override
	public void compare(String t1, String t2) {		
	}	
}
/**
 *ʵ���෺�ͣ��ӿڲ���
 */
class C<T> implements Compare{

	@Override
	public void compare(Object t1, Object t2) {
		
	}
}
/**
 *ʵ������ӿ�ͬʱ����
 */
class D implements Compare{

	@Override
	public void compare(Object t1, Object t2) {
		
	}
}
/**
 *����:ʵ����������ӿڷ���
 *class E implements Compare<T>{

	@Override
	public void compare(T t1, T t2) {
		
	}
}
 */
