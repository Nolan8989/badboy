package nolan.thread.create;
/**
 * ��ʵ��ɫ �������ɫ
 * @author Administrator
 *
 */
public class WeddingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʵ��ɫ
		Wedding you =new You();
		//�����ɫ +��ʵ��ɫ����
		Wedding proxy =new Company(you);
		//������Ϊ
		proxy.marry();
	}

}
