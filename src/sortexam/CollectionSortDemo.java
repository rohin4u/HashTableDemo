package sortexam;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("delhi");
		l.add("srinagar");
		l.add("manali");
		l.add("palwal");
		l.add("jhasi");
		l.add("meerut");
		
		System.out.println(l);
		
		Collections.sort(l, new MyComparator());
		System.out.println(l);

	}

}
