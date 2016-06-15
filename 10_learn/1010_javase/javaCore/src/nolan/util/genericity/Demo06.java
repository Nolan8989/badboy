package nolan.util.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * jdb7 对泛型的改进
 * @author Administrator
 *
 */
public class Demo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list1 =new ArrayList<String>();
		//jdk7改进
		List<String> list2 =new ArrayList<>();
	}

}
