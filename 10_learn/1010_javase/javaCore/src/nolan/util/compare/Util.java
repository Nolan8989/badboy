package nolan.util.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * ��ģ��java.util.Collections
 * @author Administrator
 *
 */
public class Util {
	/**
	 * ʹ��List ��Ȼ���� +�ṩ�Ƚ���
	 * 1������ ת�� Object����
	 * 2����������
	 * 3������list �޸�
	 * @param arr
	 */
	public static <T> void sort(List<T> list,Comparator<T> com){
		//1������ ת�� Object����
		Object[] arr =list.toArray();
		//2����������
		sort(arr,com);
		//3������list 
		for(int i=0;i<arr.length;i++){
			list.set(i, (T)arr[i]);
		}
	}
	
	/**
	 * ��Ȼ����:Object[] ���� ʹ�ñȽ���
	 * @param arr
	 */
	public static void sort(Object[] arr,Comparator com){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //�ٶ������Ѿ�����
			for(int i=0;i<arr.length-1-j;i++){
				if(com.compare(arr[i],arr[i+1])>0){
					Object temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //�ٶ�ʧ��
				}							
			}	
			if(sorted){ //�ٶ��ɹ�
				break; //��������
			}			
		}
		
	}
	
	
	
	
	
	
	
	/**
	 * ʹ��List ��Ȼ����
	 * 1������ ת�� Object����
	 * 2����������
	 * 3������list �޸�
	 * @param arr
	 */
	public static <T extends Comparable> void sort(List<T> list){
		//1������ ת�� Object����
		Object[] arr =list.toArray();
		//2����������
		sort(arr);
		//3������list 
		for(int i=0;i<arr.length;i++){
			list.set(i, (T)arr[i]);
		}
	}
	
	
	
	/**
	 * ʹ�÷��� ��Ȼ����
	 * @param arr
	 */
	public static <T extends Comparable> void sort(T[] arr){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //�ٶ������Ѿ�����
			for(int i=0;i<arr.length-1-j;i++){
				if(((Comparable)arr[i]).compareTo(arr[i+1])>0){
					T temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //�ٶ�ʧ��
				}				
			}	
			if(sorted){ //�ٶ��ɹ�
				break; //��������
			}			
		}
	}
	
	
	
	
	/**
	 * ��Ȼ����: Object[] ����
	 * @param arr
	 */
	public static void sort(Object[] arr){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //�ٶ������Ѿ�����
			for(int i=0;i<arr.length-1-j;i++){
				if(((Comparable)arr[i]).compareTo(arr[i+1])>0){
					Object temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //�ٶ�ʧ��
				}				
			}	
			if(sorted){ //�ٶ��ɹ�
				break; //��������
			}			
		}
		
	}
	
	
	/**
	 * ��Ȼ����: int[] ����
	 * @param arr
	 */
	public static void sort(int[] arr){
		boolean sorted =true; 
		for(int j=0;j<arr.length-1;j++){
			 sorted =true; //�ٶ������Ѿ�����
			for(int i=0;i<arr.length-1-j;i++){
				if(arr[i]>arr[i+1]){
					int temp =arr[i];
					arr[i] =arr[i+1];
					arr[i+1] =temp;	
					sorted =false; //�ٶ�ʧ��
				}				
			}	
			if(sorted){ //�ٶ��ɹ�
				break; //��������
			}			
		}
		
	}
}
