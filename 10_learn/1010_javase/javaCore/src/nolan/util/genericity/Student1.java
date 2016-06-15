package nolan.util.genericity;
/**
 * 使用Object 发生多态
 * 1、手动类型检查
 * 2、手动强制转换
 * @author Administrator
 *
 */
public class Student1 {
	private Object oracleScore;
	private Object javasScore;
	
	public Student1() {
	}	
	public Object getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(Object oracleScore) {
		this.oracleScore = oracleScore;
	}





	public Object getJavasScore() {
		return javasScore;
	}





	public void setJavasScore(Object javasScore) {
		this.javasScore = javasScore;
	}





	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建对象
		Student1 stu =new Student1();
		//存放 字符串 
		stu.setJavasScore("优秀");
		stu.setOracleScore(90);
		
		//获取对应的值  1、手动强制类型转换
		Integer oracleScore = (Integer)stu.getOracleScore();
		//获取对应的值  ClassCastException 2、手动的类型检查
		if(stu.getJavasScore() instanceof Integer){
			Integer javaScore =(Integer) stu.getJavasScore();
		}
		
	}

}
