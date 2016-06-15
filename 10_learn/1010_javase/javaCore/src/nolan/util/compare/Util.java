package nolan.util.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * 简单模仿java.util.Collections
 * @author Administrator
 *
 */
public class Util {
	/**
	 * 使用List 自然升序 +提供比较器
	 * 1、容器 转成 Object数组
	 * 2、数组排序
	 * 3、重置list 修改
	 * @param arr
	 */
	public static <T> void sort(List<T> list,Comparator<T> com){
		//1、容器 转成 Object数组
		Object[] arr =list.toArray();
		//2、数组排序
		sort(arr,com);
		//3、重置list 
		for(int i=0;i<arr.length;i++){
			list.set(i, (T)arr[i]);
		}
	}
	
	/**
	 * 自然升序:Object[] 排序 使用比较器
	 * @param arr
	 */
	public static void sort(Object[] arr,Comparator com){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //假定此趟已经有序
			for(int i=0;i<arr.length-1-j;i++){
				if(com.compare(arr[i],arr[i+1])>0){
					Object temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //假定失败
				}							
			}	
			if(sorted){ //假定成功
				break; //减少趟数
			}			
		}
		
	}
	
	
	
	
	
	
	
	/**
	 * 使用List 自然升序
	 * 1、容器 转成 Object数组
	 * 2、数组排序
	 * 3、重置list 修改
	 * @param arr
	 */
	public static <T extends Comparable> void sort(List<T> list){
		//1、容器 转成 Object数组
		Object[] arr =list.toArray();
		//2、数组排序
		sort(arr);
		//3、重置list 
		for(int i=0;i<arr.length;i++){
			list.set(i, (T)arr[i]);
		}
	}
	
	
	
	/**
	 * 使用泛型 自然升序
	 * @param arr
	 */
	public static <T extends Comparable> void sort(T[] arr){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //假定此趟已经有序
			for(int i=0;i<arr.length-1-j;i++){
				if(((Comparable)arr[i]).compareTo(arr[i+1])>0){
					T temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //假定失败
				}				
			}	
			if(sorted){ //假定成功
				break; //减少趟数
			}			
		}
	}
	
	
	
	
	/**
	 * 自然升序: Object[] 排序
	 * @param arr
	 */
	public static void sort(Object[] arr){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //假定此趟已经有序
			for(int i=0;i<arr.length-1-j;i++){
				if(((Comparable)arr[i]).compareTo(arr[i+1])>0){
					Object temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //假定失败
				}				
			}	
			if(sorted){ //假定成功
				break; //减少趟数
			}			
		}
		
	}
	
	
	/**
	 * 自然升序: int[] 排序
	 * @param arr
	 */
	public static void sort(int[] arr){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //假定此趟已经有序
			for(int i=0;i<arr.length-1-j;i++){
				if(arr[i]>arr[i+1]){
					int temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //假定失败
				}				
			}	
			if(sorted){ //假定成功
				break; //减少趟数
			}			
		}
		
	}
}
