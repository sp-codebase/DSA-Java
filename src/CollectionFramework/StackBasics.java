package CollectionFramework;
import java.util.*;


public class StackBasics {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(19);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
