package CollectionFramework;
import java.util.*;
public class MapBasics {
    public static void main(String[] args) {
        //array
        Integer [] arr = {5,7,6,8,4};
        Arrays.sort(arr  ,new ReverseCmp());
        for(int a:arr){
            System.out.print(a + " ");
        }

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(24);
//        list.add(2);
//        list.add(13);
//        list.add(10);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

//        List<Student2> students = new ArrayList<>();
//        students.add(new Student2(19,"vipun",69));
//        students.add(new Student2(21,"vishal",69));
//        students.add(new Student2(22,"ankit",68));
//        students.add(new Student2(23,"kalan",59));
//        students.add(new Student2(23,"lucky",59));
//        System.out.println(students);
//        Collections.sort(students);
//        Collections.sort(students , new Comparator<Student2>(){
//            @Override
//            public int compare(Student2 o1, Student2 o2) {
//                return o1.weight - o2.weight;
//            }
//        });

        //A Lambda Expression in Java is a short way to write an anonymous function (a function without a name)
       // Collections.sort(students,(o1,o2)-> o1.weight - o2.weight);
//        Collections.sort(students, new WeightComparator());
//
//
//        System.out.println(students);
    }
}
