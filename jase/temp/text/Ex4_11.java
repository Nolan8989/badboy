package temp.text;
import javax.swing.JOptionPane;
public class Ex4_11
{
	public static void main(String[] args)
	{
		String intString=JOptionPane.showInputDialog(null,"请输入一个整数","例4-5演示",JOptionPane.QUESTION_MESSAGE);
		int n=Integer.parseInt(intString);
		JOptionPane.showMessageDialog(null,"Fibonacci序列第"+n+"项为："+f(n),"例4.11输出",JOptionPane.INFORMATION_MESSAGE);
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
