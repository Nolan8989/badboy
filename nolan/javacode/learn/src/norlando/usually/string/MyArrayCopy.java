package norlando.usually.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayCopy  {

//	StringBuilder sb = new StringBuilder();
//	 public StringBuilder deleteCharAt(int index) {
//	        
//	        return super.deleteCharAt(index);
//	    }
//	public AbstractStringBuilder deleteCharAt(int index) {
//        if ((index < 0) || (index >= count))
//            throw new StringIndexOutOfBoundsException(index);
//        System.arraycopy(value, index+1, value, index, count-index-1);
//        count--;
//        return this;
//    }
	//char[] a = {'a','b','c','d'} ;//length=4,

	/*
	  AbstractStringBuilder(int capacity) {   构造方法的扩容
        value = new char[capacity];
    }
	 */
	
	StringBuilder sb = new StringBuilder("abcdefg");
	

	
	public static void main(String args[]){
		
		char a[] = {'a','b','c','d','e','f'};
	//	System.out.println(a instanceof Array);
	
	//	char [] b = arraycopy(a,2);
	//	for(int  i = 0 ; i<b.length;i++){
	//		System.out.print(b[i]);
//		}
	}

	

	public static Object arraycopy(Object src  ,int srcPos , Object dest ,int destPos,int length ){
		if(src == null){
			throw new NullPointerException();
		}
		if(dest == null){
			 throw new NullPointerException();
		}
		int copylength = length;
		if ((srcPos < 0) || ( destPos< 0)){
			throw new IndexOutOfBoundsException();
		}
		if(src instanceof Arrays[] && dest instanceof Array[]){
			Arrays [] a = (Arrays[] )src;
			//Arrays [] b = new Arrays;
			int lk[] = new int[10];
			
					
		}
		
		for(int k = 0; k <destPos;k++){
//			b[k] = a[k];
		}
		for(int i = srcPos ;i<(destPos + length + 1);i++){
//			b[i-1] = a[i];
		}
		return dest;
	}
	
/*	
	public static char[] arraycopy(char[] a){
		
		int count = a.length;
		char[] b = new char[count];
		for(int i=0;i<count;i++){
			b[i] = a[i];
		}
		
		return b;
	}
*/
}
