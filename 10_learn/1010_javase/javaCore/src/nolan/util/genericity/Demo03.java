package nolan.util.genericity;

import java.io.Closeable;
import java.io.IOException;

/**
 * 泛型方法
 * 传进来的参数不定的时候，需要定义泛型示例：
 * @author Administrator
 *
 */
public class Demo03 {
	/*
	public static  void closeAll(Closeable... io){
		for(Closeable temp:io){
				try {
					if(null!=temp){
						temp.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	*/
	//泛型方法
	//<T extends Closeable>传进来的参数设定的泛型
	public static <T extends Closeable>  void closeAll(T... io){
		for(Closeable temp:io){
				try {
					if(null!=temp){
						temp.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
