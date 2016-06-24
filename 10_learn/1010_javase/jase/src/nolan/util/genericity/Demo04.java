package nolan.util.genericity;
/**
 * 泛型的嵌套:使用时嵌套
 * @author Administrator
 *
 */
public class Demo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//从里到外设置
		String score ="优秀";
		Student3<String> stu =new Student3<String>();
		stu.setHtmlScore(score);
		Bjsxt<Student3<String>> room =new Bjsxt<Student3<String>>();
		room.setStu(stu);		
		//从外到里访问
		Student3<String> stu2 =room.getStu();
		String score2=stu2.getHtmlScore();
	}
 }
class Bjsxt<T>{
	private T stu;
	public Bjsxt() {
	}
	
	public T getStu() {
		return stu;
	}

	public void setStu(T stu) {
		this.stu = stu;
	}
	
	
	
}

