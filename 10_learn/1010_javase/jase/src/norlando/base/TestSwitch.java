package norlando.base;

public class TestSwitch {

	public static void main(String[] args) {

		double d = Math.random();
		int i = 1 + (int) (d * 6);
		System.out.println(i);
		
		if(i==6){
			System.out.println("it's luck too much");
		}else if(i==5){
			System.out.println("it's good luck");
		}else if (i==4){
			System.out.println("it's bad");
		}else {
			System.out.println("it's misfortune ");
		}
		
		System.out.println("=====================Switch==================");
		switch(i){//int,�����Զ�����תΪint������(byte,char,short)��ö�١�//JDK7�п��Է����ַ�����
		case 6:
			System.out.println("it's luck too much");
			break;
		case 5:
			System.out.println("it's good luck");
			break;
		case 4:
			System.out.println("it's bad");
			break;
		default :
			System.out.println("it's misfortune ");
			break;
		}
		
		System.out.println("==================Switch/case  ����break��͸ ʾ��1================");
		char c = 'a';
		int rand = (int)(26 * Math.random());
		char c2 = (char)(c + rand);
		System.out.println(c2);
		switch(c2){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ��");
			break;
		case 'y':
		case 'w':
			System.out.println("��Ԫ��");
			break;
		default:
			System.out.println("����");
			break;
		}
		
		System.out.println("==================Switch/case  ����break��͸ ʾ��2================");
		System.out.println("�������·ݣ�");
		int month = (int)(12 * Math.random() +1);
		System.out.println("������·�Ϊ��" + month);
		if(month > 0 && month <13){
			switch(month){
			case 2:
				System.out.println("28��");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30��");
				break;
			default :
				System.out.println("31��");
			}
		}else{
			System.out.println("������·ݲ���ȷ");
		}
		
		System.out.println("==================Switch/case ���䷶Χת��Ϊ��ֵ================");
		int score = (int)(101*Math.random());
		System.out.println(score);
		if(score >= 1 && score <=100){
			int s = score/10;
			switch(s){
			case 10 :
			case 9 :
				System.out.println("����");
				break;
			case 8:
				System.out.println("����");
				break;
			case 7 :
			case 6 :
				System.out.println("����");
				break;
			case 5:
			case 4:
			case 3:
				System.out.println("������");
				break;
			default:
				System.out.println("���ϸ�ָ��");
			}
		}else{
			System.out.println("������Χ��");
		}
			
		
		System.out.println("==================Switch jdk 1.7 �¼���================");
		String  a = "����";
		
		switch (a) {   //JDK7�������ԣ����ʽ����������ַ���������
		case "��ʿ��":
			System.out.println("�������ʿ��");
			break;
		case "����":
			System.out.println("����ĸ���");
			break;
		default:
			System.out.println("��Һã�");
			break;
		}
		
		
	}

}
