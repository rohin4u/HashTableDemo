package sortexam;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = o1.toString();
		String s2 = (String)o2;
		
		return -s1.compareTo(s2);
	}
	
	

}
