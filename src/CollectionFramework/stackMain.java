package CollectionFramework;

import java.util.Stack;
import java.util.List;


public class stackMain {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(200);
        System.out.println(list);
        list.push(20);
        System.out.println(list);

        list.pop();
        System.out.println(list);

        System.out.println(list.peek());

        System.out.println(list.search(44));

        System.out.println(list.isEmpty());
    }
}
