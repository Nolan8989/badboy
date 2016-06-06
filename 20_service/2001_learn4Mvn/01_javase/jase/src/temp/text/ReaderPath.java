package temp.text;
import java.io.*;
/**
 * 读取路径，判断若为目录，则输出该目录下所有子文件和目录名称。若为文件则直接输出
 * 文件路径。
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
		System.out.print("请输入信息：");
		filePath=br.readLine();//
		File fileName=new File(filePath);
		if(fileName.isDirectory())
		{
			System.out.println(fileName.getName()+"是一个目录");
			System.out.println("*****************************");
			File list[]=fileName.listFiles();
			for(int i=0;i<list.length;i++)
			{
				System.out.println(list[i].getName());
			}
		}
		else
		{
			System.out.println(fileName.getName()+"是一个文件");
			System.out.println("*******************************");
			System.out.println(fileName.getAbsolutePath());
		}
	}
}
