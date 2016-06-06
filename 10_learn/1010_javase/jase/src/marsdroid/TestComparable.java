package marsdroid;

import java.util.*;

public class TestComparable {
	public static void main(String[] args) {
		List l1 = new LinkedList();
		l1.add(new Name ("Karl","M"));
		l1.add(new Name ("Steven","Lee"));
		l1.add(new Name ("John","O"));
		l1.add(new Name ("Tom","M"));
		
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

}



	
	

