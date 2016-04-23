package norlando.util.泛型;
/**
 * 泛型类: <> ,编译期行为
 * 字母:任意编写，常见的字母
 * T:type
 * K:key
 * V:value
 * E:element
 * 
 * 1、省心:不用类型转换
 * 2、安全:不用类型安全
 * 
 * 
 * @author Administrator
 *
 * @param <T1>
 * @param <T2>
 */
public class Student2<T1, T2> {
	private T1 javaScore;
	private T2 oracleScore;
	//不能使用在静态属性上
	//private static T1 htmlScore;
	public Student2() {
	}

	public T1 getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}

	public T2 getOracleScore() {
		return oracleScore;
	}

	public void setOracleScore(T2 oracleScore) {
		this.oracleScore = oracleScore;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建对象 使用的时候确定类型
		Student2<String,Integer> stu =new Student2<String,Integer>();
		//设置值
		stu.setJavaScore("优秀");
		stu.setOracleScore(80);
		
		//获取 自动类型检查
		//Integer score1 =stu.getJavaScore();
		//获取 自动强制转换
		String score2 =stu.getJavaScore();
		
		//不能使用基本类型
		//Student2<int,Integer> stu2;
		
		//泛型类没有指定类型，同一使用Object处理 ，泛型的擦除
		Student2 stu2 =new Student2();
		stu2.setJavaScore("javase");
	}

}
