import java.util.*;

public class QueueDS {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(12);
		queue.offer(13);
		queue.offer(18);
		System.out.println(queue);
		queue.poll();
		
		System.out.println(queue.peek());
		//add offer , peek element , remove , poll
		
	}

}
