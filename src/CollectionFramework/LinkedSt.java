package CollectionFramework;
import java.util.*;
public class LinkedSt {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();//set in a order->o(n)
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        System.out.println(set1);
    }
}
