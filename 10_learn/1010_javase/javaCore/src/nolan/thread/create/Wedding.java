package nolan.thread.create;
/**
 * ģ�⾲̬����
 * 1����ʵ��ɫ  �����ɫ   
 *    ���߽�ɫ ʵ����ͬ�Ľӿ�
 * 2�������ɫ  ������ʵ��ɫ������   	
 * @author Administrator
 *
 */
public interface Wedding {
	public void marry();
}
//��ʵ��ɫ
class You implements Wedding{

	@Override
	public void marry() {
		System.out.println("you and �϶�����.....");
	}
	
}
//�����ɫ  alt+shift +s -->r  -->tab -->�س�-->shift+tab -->�س�
 class Company implements Wedding{
	    //��ʵ��ɫ������
	 	private Wedding target;
	 
	 	public Company() {
			// TODO Auto-generated constructor stub
		} 	
	 	
		public Company(Wedding target) {
			super();
			this.target = target;
		}


		public void ready(){
			System.out.println("�������ѡ�������");
		}
		public void after(){
			System.out.println("������.....");
		}
		//������Ϊ
		public void marry() {
			ready();
			this.target.marry();
			after();
		}


		public Wedding getTarget() {
			return target;
		}


		public void setTarget(Wedding target) {
			this.target = target;
		}


		
		
		
}
