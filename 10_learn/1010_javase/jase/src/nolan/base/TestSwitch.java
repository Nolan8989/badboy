package nolan.base;

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
		switch(i){//int,或者自动可以转为int的类型(byte,char,short)。枚举。//JDK7中可以放置字符串。
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
		
		System.out.println("==================Switch/case  利用break穿透 示例1================");
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
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
			break;
		}
		
		System.out.println("==================Switch/case  利用break穿透 示例2================");
		System.out.println("请输入月份：");
		int month = (int)(12 * Math.random() +1);
		System.out.println("输入的月份为：" + month);
		if(month > 0 && month <13){
			switch(month){
			case 2:
				System.out.println("28天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30天");
				break;
			default :
				System.out.println("31天");
			}
		}else{
			System.out.println("输入的月份不正确");
		}
		
		System.out.println("==================Switch/case 区间范围转换为多值================");
		int score = (int)(101*Math.random());
		System.out.println(score);
		if(score >= 1 && score <=100){
			int s = score/10;
			switch(s){
			case 10 :
			case 9 :
				System.out.println("优秀");
				break;
			case 8:
				System.out.println("良好");
				break;
			case 7 :
			case 6 :
				System.out.println("及格");
				break;
			case 5:
			case 4:
			case 3:
				System.out.println("不及格");
				break;
			default:
				System.out.println("找老高指导");
			}
		}else{
			System.out.println("超出范围！");
		}
			
		
		System.out.println("==================Switch jdk 1.7 新加入================");
		String  a = "高琪";
		
		switch (a) {   //JDK7的新特性，表达式结果可以是字符串！！！
		case "马士兵":
			System.out.println("输入的马士兵");
			break;
		case "高琪":
			System.out.println("输入的高琪");
			break;
		default:
			System.out.println("大家好！");
			break;
		}
		
		
	}

}
