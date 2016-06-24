package nolan.util.compare;

import java.util.Comparator;

public class PersonComp implements Comparator<Person> {
	//按年龄升序
	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getAge() -o2.getAge();
		
	} 

}
