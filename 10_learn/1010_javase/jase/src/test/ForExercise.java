package test;

/**
 * ������¸�ʽ��
 *     1
 *    212
 *   32123
 *  4321234
 * 543212345
 * @author Administrator
 *
 */
public class ForExercise
{
	public static void main(String[] args)
	{
		final int NUM_OF_LINES=5;
		for(int row=1;row<=NUM_OF_LINES;row++)
		{
			for(int col=1;col<=NUM_OF_LINES-row;col++)
			System.out.print(" ");
			for(int n=row;n>=1;n--)
			System.out.print(n);
		  for(int n=2;n<=row;n++)
		  System.out.print(n);
		  System.out.println();
		}
	}
}

		  