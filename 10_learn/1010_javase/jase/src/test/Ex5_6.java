package test;
import javax.swing.JOptionPane;
public class Ex5_6
{
	public static void main(String[] args)
  {
  	//int i=0,flag=0;
	  String s=JOptionPane.showInputDialog(null,"����һ���ַ�����","��5.6����",JOptionPane.QUESTION_MESSAGE);
	  String output=" ";
	  if(comp(s))
	  output+=s+"�ǻ���";
	  else
	  output+=s+"���ǻ���";
	  JOptionPane.showMessageDialog(null,output,"��5.6���",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
  public static boolean comp(String s)
  {
  	//int i=0;
  	char[] charArray=s.toCharArray();
  	for(int i=0;i<s.length()/2;i++)
  	{
  		if(charArray[i]!=charArray[s.length()-1-i])
  		return false;
  	}
  	return true;
  }
}

