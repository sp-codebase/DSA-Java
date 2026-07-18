package CollectionFramework;
import java.util.*;
public class PriorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>((a,b)-> b-a);

        //default behaviour -> integers -> less value -> hogh priority-> minHeap
        // maxHeap -> Integers -> high value -> high priority
        // q -> Strings -> comparator
        q.offer(40);
        q.offer(30);
        q.offer(20);
        q.offer(10);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());
    }
}
