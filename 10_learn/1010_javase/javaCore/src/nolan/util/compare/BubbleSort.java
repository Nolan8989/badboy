package nolan.util.compare;

import java.util.Arrays;
/**
 *√∞≈›≈≈–Ú
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		compare(a);
	}
	
	public static void compare(int[] a){
		boolean sorted = true;
		for (int j =0; j<a.length - 1; j++ ){
			sorted = true;
			System.out.println("µ⁄"+ (j+1) +"ÃÀ£∫");
			for (int i = 0 ; i< a.length -1 -j ; i++){
				if(a[i] >a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
					System.out.print("µ⁄"+(i+1)+ "¥Œ≈≈–Ú:");
					System.out.println(Arrays.toString(a));
				}
			}
			if(sorted){
				break;
			}
		}
	}

}
