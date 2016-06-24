package nolan.thread.create;
/**
 * 真实角色 、代理角色
 * @author Administrator
 *
 */
public class WeddingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//真实角色
		Wedding you =new You();
		//代理角色 +真实角色引用
		Wedding proxy =new Company(you);
		//代理行为
		proxy.marry();
	}

}
