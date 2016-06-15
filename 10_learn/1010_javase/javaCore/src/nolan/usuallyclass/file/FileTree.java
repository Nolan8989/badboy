package nolan.usuallyclass.file;

import java.io.File;

public class FileTree {
	public static void main(String[] args) {
		//��һ���Լ�Ӳ�������õ��ļ���
		File f = new File("D:\\java300\\�������");
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
			//��ǿforѭ��
			for (File temp : files) {
				printFile(temp, level+1);
			}
		}
	}
}
