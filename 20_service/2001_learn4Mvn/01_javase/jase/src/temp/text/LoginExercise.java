package temp.text;
import java.util.*;
/**
 * 登陆验证练习。
 * @author Administrator
 *
 */
public class LoginExercise
{
  public static void main(String[] args)
  {
    Scanner stdin = new Scanner(System.in);
    int a=0;
    int b=0;
    do
    {
    	//Scanner stdin = new Scanner(System.in);
    	b=0;
      try{  
        do{
			System.out.println("输入学号");
			//Scanner stdin = new Scanner(System.in);
			int num=stdin.nextInt();
			//b=2; 
			if (num==20120208){
				System.out.println("输入密码");
				int stukey=stdin.nextInt();
				if(stukey==20120208){
				  System.out.println("登陆成功！");
				  a=0;
				}else{
				  System.out.println("密码错误");
				  //a=1;
				}
			}else{
			   System.out.println("学号错误");
			   a=1;
			}
        }
       while(a==1);
       }catch(Exception e){
        System.out.println("学号或密码应为数字");
        b=1;
        stdin.nextLine();
		}
      //finally
      //{
      //	stdin.dispose();
      //}
    }
    while(b==1);
  }
}

