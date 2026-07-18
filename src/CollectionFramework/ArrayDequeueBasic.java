package CollectionFramework;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeueBasic {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.offer(1);
        d.offer(2);
        d.offer(3);
        d.offer(4);
        System.out.println(d);

        d.pollLast();
        System.out.println(d);
        d.pollFirst();
        System.out.println(d);

        System.out.println(d.size());
        System.out.println(d.peek());


    }
}
