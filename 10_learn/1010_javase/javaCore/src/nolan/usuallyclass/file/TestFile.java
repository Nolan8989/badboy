package nolan.usuallyclass.file;

import java.io.File;
import java.io.IOException;
/*
 * 测试File常用功能；
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		/*
		 * 判断文件是否存在exists();
		 */
//		System.out.println(f.exists());
		
		
		/*
		 * 创建文件夹、文件；
		 */
		File f2 = new File("d:/src5");
		File createfile = new File(f2,"createfile.java");
		//createfile.mkdir();//创建文件夹
		createfile.mkdirs();//创建多个文件夹
		boolean b = createfile.createNewFile();//创建文件,
		System.out.println(b?"文件创建成功":"文件创建失败");
		
		
		
		/*
		 * 删除文件delete();可以删文件和文件夹 ；但是要一层一层删。
		 */
		//createfile.delete();
		//f2.delete();
		
		
		
		/*
		 * 判断是否是文件、是否是文件夹。
		 */
		if(f2.isFile()){
			System.out.println("是一个文件");
		}
		if(f2.isDirectory()){
			System.out.println("是一个目录");
		}
		
	}
}
