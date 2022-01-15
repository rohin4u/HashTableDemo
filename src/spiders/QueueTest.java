package spiders;

import java.util.PriorityQueue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		PriorityQueue p = new PriorityQueue(new MyComparator());
		
		for(int i=0; i<10; i++) {
			
			p.offer(i);
		}
		System.out.println(p);
	}

}
