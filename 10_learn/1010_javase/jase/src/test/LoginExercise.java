package test;
import java.util.*;
/**
 * ��½��֤��ϰ��
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
			System.out.println("����ѧ��");
			//Scanner stdin = new Scanner(System.in);
			int num=stdin.nextInt();
			//b=2; 
			if (num==20120208){
				System.out.println("��������");
				int stukey=stdin.nextInt();
				if(stukey==20120208){
				  System.out.println("��½�ɹ���");
				  a=0;
				}else{
				  System.out.println("�������");
				  //a=1;
				}
			}else{
			   System.out.println("ѧ�Ŵ���");
			   a=1;
			}
        }
       while(a==1);
       }catch(Exception e){
        System.out.println("ѧ�Ż�����ӦΪ����");
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

