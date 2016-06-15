package nolan.util.compare;

import java.util.Comparator;

public class PersonComp implements Comparator<Person> {
	//°´ÄêÁäÉıĞò
	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getAge() -o2.getAge();
		
	} 

}
