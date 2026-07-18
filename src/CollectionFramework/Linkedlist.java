package CollectionFramework;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.indexOf(4));
        System.out.println(list.get(0));

        //addFirst , addLast
        list.remove(0);
        System.out.println("Printing original list"  + list);
        list.addFirst(5);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.peek());
        System.out.println("Before" +list);
        System.out.println(list.poll());
        System.out.println("After" +list);
        System.out.println(list.offer(60));
        System.out.println(list);

    }
}
