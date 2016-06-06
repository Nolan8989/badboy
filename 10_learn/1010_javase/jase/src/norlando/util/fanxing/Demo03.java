package norlando.util.fanxing;

import java.io.Closeable;
import java.io.IOException;

/**
 * ���ͷ���
 * �������Ĳ���������ʱ����Ҫ���巺��ʾ����
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
	//���ͷ���
	//<T extends Closeable>�������Ĳ����趨�ķ���
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
