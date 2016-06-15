package nolan.thread.create;
/**
 * 模拟静态代理
 * 1、真实角色  代理角色   
 *    二者角色 实现相同的接口
 * 2、代理角色  持有真实角色的引用   	
 * @author Administrator
 *
 */
public interface Wedding {
	public void marry();
}
//真实角色
class You implements Wedding{

	@Override
	public void marry() {
		System.out.println("you and 嫦娥结婚了.....");
	}
	
}
//代理角色  alt+shift +s -->r  -->tab -->回车-->shift+tab -->回车
 class Company implements Wedding{
	    //真实角色的引用
	 	private Wedding target;
	 
	 	public Company() {
			// TODO Auto-generated constructor stub
		} 	
	 	
		public Company(Wedding target) {
			super();
			this.target = target;
		}


		public void ready(){
			System.out.println("布置猪窝。。。。");
		}
		public void after(){
			System.out.println("闹玉兔.....");
		}
		//代理行为
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
