package nolan.util.compare;

public class StringComp implements java.util.Comparator<String> {
	//������ĸ����
	@Override
	public int compare(String o1, String o2) {
		return o1.charAt(0)-o2.charAt(0);
	}

}
