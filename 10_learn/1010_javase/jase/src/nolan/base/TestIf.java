package nolan.base;
public  class TestIf {

	public static void main(String[] args) {
		double d = Math.random();
		int i = 1 + (int) (d * 6);
		System.out.println(i);
		
		if(i==6){
			System.out.println("it's luck too much");
		}else if(i>=4){
			System.out.println("it's good luck");
		}else if (i>=2){
			System.out.println("it's bad");
		}else {
			System.out.println("it's misfortune ");
		}
		
		
		double r = 4*Math.random();
		double area = Math.PI * Math.pow(r, 2);
		double circle = 2 * Math.PI * r;
		System.out.println("半径为：" + r );
		System.out.println("面积为：" + area );
		System.out.println("周长为：" + circle );
		if (area > circle){
			System.out.println("面积大于周长");
		}else if (area < circle){
			System.out.println("面积小于周长");
		}
		
		int age = (int)(100 * Math.random());
		System.out.print("年龄是："+ age+"属于：");
		if(age <15){
			System.out.println("儿童，喜欢玩耍");
		}else if(age < 25){
			System.out.println("青年，要学习！");
		}else if(age <45){
			System.out.println("中年，要工作。");
		}else if(age <65){
			System.out.println("中老年要补钙");
		}else if(age <85){
			System.out.println("老年，多运动");
		}else{
			System.out.println("老寿星，古来稀");
		}
		
		int score = (int)(101*Math.random());
		System.out.println(score);
		if(score >= 90 && score <=100){
			System.out.println("优秀");
		}else if(score >=80){
			System.out.println("良好");
		}else if(score >=60){
			System.out.println("及格");
		}else if(score >=30){
			System.out.println("不及格");
		}else{
			System.out.println("找老高指导");
		}
	
		char c = 'a';
		int rand = (int)(26 * Math.random());
		char c2 = (char)(c + rand);
		System.out.println(c2);
		if(c2 == 'a'||c2 =='e'||c2 =='i'||c2 =='o'||c2 =='u'){
			System.out.println("元音");
		}else if(c2 =='w'||c2 =='y'){
			System.out.println("半元音");
		}else{
			System.out.println("辅音");
		}
		
	}
	
}
