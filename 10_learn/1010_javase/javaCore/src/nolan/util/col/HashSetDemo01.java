package nolan.util.col;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class HashSetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is a cat and that is a mice where is the food";
		Set<String> set = new HashSet<String>();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreElements()){
			String temp = (String)st.nextElement();
			set.add(temp);
		}
		System.out.println(set.size());
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		
		
	}

}
