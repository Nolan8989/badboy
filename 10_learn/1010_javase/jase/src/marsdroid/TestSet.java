package marsdroid;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		
		s1.add("a");
		s1.add("b");
		s1.add("c");
		
		s2.add("d");
		s2.add("a");
		s2.add("b");
		
		Set su =new HashSet(s1);
		su.retainAll(s2);
		
		Set sn = new HashSet(s2);
		sn.addAll(s1);
		
		System.out.println(su);
		System.out.println(sn);
		

	}

}
