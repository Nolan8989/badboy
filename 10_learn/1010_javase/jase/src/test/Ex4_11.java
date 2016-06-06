package test;
import javax.swing.JOptionPane;
public class Ex4_11
{
	public static void main(String[] args)
	{
		String intString=JOptionPane.showInputDialog(null,"������һ������","��4-5��ʾ",JOptionPane.QUESTION_MESSAGE);
		int n=Integer.parseInt(intString);
		JOptionPane.showMessageDialog(null,"Fibonacci���е�"+n+"��Ϊ��"+f(n),"��4.11���",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	public static long f(long n)
	{
		if((n==0)||(n==1))
		return 1;
		else
		return f(n-1)+f(n-2);
	}
}
