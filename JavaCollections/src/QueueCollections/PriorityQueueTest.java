package QueueCollections;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(750);
		pq.add(900);
		pq.add(500);
		pq.add(100);

		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.poll()); // first value
	}

}
