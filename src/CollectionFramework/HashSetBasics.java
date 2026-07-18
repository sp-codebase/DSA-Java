package CollectionFramework;
import java.util.*;
public class HashSetBasics {
    static void main(String[] args) {
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//   // o(1)
//        set1.add(10);
//        set1.add(20);
//        set1.add(30);
//
//        set2.add(40);
//        set2.add(50);
//        set2.add(60);
//        set2.add(20);
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1);
//        System.out.println(set2);
//        System.out.println(set1.containsAll(set2));

        HashSet<Student> set = new HashSet<>();
         Student s1 = new Student(1, "John");
         Student s2 = new Student(1, "John" );
         Student s3 = new Student(1, "John");

         set.add(s1);
         set.add(s2);
         set.add(s3);

         System.out.println(set);
    }
}
