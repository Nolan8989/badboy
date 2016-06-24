package nolan.usuallyclass.file;

import java.io.File;

public class FileTree {
	public static void main(String[] args) {
		//找一个自己硬盘上有用的文件夹
		File f = new File("D:\\java300\\常用软件");
		printFile(f, 0);
	}

	
	static void printFile(File file,int level){
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.println(file.getName()); 
		
		if(file.isDirectory()){
			File[]  files = file.listFiles();
//			for(int i=0;i<files.length;i++){
//				File temp = files[i];
//			}
			//增强for循环
			for (File temp : files) {
				printFile(temp, level+1);
			}
		}
	}
}
