import java.util.*;

public class PriorityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(2);
		pq.offer(4);
		pq.offer(8);
		pq.offer(1);
		System.out.println(pq);
		System.out.println(pq.poll());

	}

}
