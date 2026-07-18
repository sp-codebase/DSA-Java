package CollectionFramework;
import java.util.*;
public class TreeSt {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();//sorted list- binary search tree-> o(logn)
        set1.add(40);
        set1.add(50);
        set1.add(39);
        System.out.println(set1);
    }
}
