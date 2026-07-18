package CollectionFramework;

import java.util.Vector;

public class VectorLt {
    public static void main(String[] args) {

        Vector<Integer> main2 = new Vector<>();

        // Add elements
        main2.add(10);
        main2.add(20);
        main2.add(30);
        main2.add(40);

        System.out.println(main2);

        // Access element
        System.out.println("First Element: " + main2.get(0));

        // Update element
        main2.set(1, 25);
        System.out.println(main2);

        // Remove element
        main2.remove(2);
        System.out.println(main2);

        // Check size
        System.out.println("Size: " + main2.size());

        // Contains
        System.out.println(main2.contains(25));

        // Clear
        main2.clear();
        System.out.println(main2);
    }
}