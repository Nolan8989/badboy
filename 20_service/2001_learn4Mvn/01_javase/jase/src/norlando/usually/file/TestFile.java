package norlando.usually.file;

import java.io.File;
import java.io.IOException;
/*
 * ����File���ù��ܣ�
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		/*
		 * �ж��ļ��Ƿ����exists();
		 */
//		System.out.println(f.exists());
		
		
		/*
		 * �����ļ��С��ļ���
		 */
		File f2 = new File("d:/src5");
		File createfile = new File(f2,"createfile.java");
		//createfile.mkdir();//�����ļ���
		createfile.mkdirs();//��������ļ���
		boolean b = createfile.createNewFile();//�����ļ�,
		System.out.println(b?"�ļ������ɹ�":"�ļ�����ʧ��");
		
		
		
		/*
		 * ɾ���ļ�delete();����ɾ�ļ����ļ��� ������Ҫһ��һ��ɾ��
		 */
		//createfile.delete();
		//f2.delete();
		
		
		
		/*
		 * �ж��Ƿ����ļ����Ƿ����ļ��С�
		 */
		if(f2.isFile()){
			System.out.println("��һ���ļ�");
		}
		if(f2.isDirectory()){
			System.out.println("��һ��Ŀ¼");
		}
		
	}
}
