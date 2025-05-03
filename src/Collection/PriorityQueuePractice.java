package Collection;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.add(8);
        pq.add(9);
        pq.add(10);

        System.out.println(pq.contains(5));
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}
