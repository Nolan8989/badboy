package norlando.util.fanxing;
/**
 * ʹ��Object ������̬
 * 1���ֶ����ͼ��
 * 2���ֶ�ǿ��ת��
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
		//��������
		Student1 stu =new Student1();
		//��� �ַ��� 
		stu.setJavasScore("����");
		stu.setOracleScore(90);
		
		//��ȡ��Ӧ��ֵ  1���ֶ�ǿ������ת��
		Integer oracleScore = (Integer)stu.getOracleScore();
		//��ȡ��Ӧ��ֵ  ClassCastException 2���ֶ������ͼ��
		if(stu.getJavasScore() instanceof Integer){
			Integer javaScore =(Integer) stu.getJavasScore();
		}
		
	}

}
