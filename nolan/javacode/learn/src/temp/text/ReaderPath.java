package temp.text;
import java.io.*;
/**
 * ��ȡ·�����ж���ΪĿ¼���������Ŀ¼���������ļ���Ŀ¼���ơ���Ϊ�ļ���ֱ�����
 * �ļ�·����
 * @author Administrator
 *
 */
public class ReaderPath
{
	public static void main(String[] args)throws IOException
	{
		String filePath;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.print("��������Ϣ��");
		filePath=br.readLine();//
		File fileName=new File(filePath);
		if(fileName.isDirectory())
		{
			System.out.println(fileName.getName()+"��һ��Ŀ¼");
			System.out.println("*****************************");
			File list[]=fileName.listFiles();
			for(int i=0;i<list.length;i++)
			{
				System.out.println(list[i].getName());
			}
		}
		else
		{
			System.out.println(fileName.getName()+"��һ���ļ�");
			System.out.println("*******************************");
			System.out.println(fileName.getAbsolutePath());
		}
	}
}
