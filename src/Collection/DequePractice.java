package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("a");
        deque.addFirst("b");

        deque.addLast("c");
        deque.addLast("d");

        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}
