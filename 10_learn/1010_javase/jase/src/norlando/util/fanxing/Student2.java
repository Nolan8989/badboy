package norlando.util.fanxing;
/**
 * ������: <> ,��������Ϊ
 * ��ĸ:�����д����������ĸ
 * T:type
 * K:key
 * V:value
 * E:element
 * 
 * 1��ʡ��:��������ת��
 * 2����ȫ:�������Ͱ�ȫ
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
	//����ʹ���ھ�̬������
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
		//�������� ʹ�õ�ʱ��ȷ������
		Student2<String,Integer> stu =new Student2<String,Integer>();
		//����ֵ
		stu.setJavaScore("����");
		stu.setOracleScore(80);
		
		//��ȡ �Զ����ͼ��
		//Integer score1 =stu.getJavaScore();
		//��ȡ �Զ�ǿ��ת��
		String score2 =stu.getJavaScore();
		
		//����ʹ�û�������
		//Student2<int,Integer> stu2;
		
		//������û��ָ�����ͣ�ͬһʹ��Object���� �����͵Ĳ���
		Student2 stu2 =new Student2();
		stu2.setJavaScore("javase");
	}

}
