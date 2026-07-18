package CollectionFramework;

import java.util.*;

public class ArrayLt {
    public static void main(String[] args) {
        //list or collection -> interface
        //Arraylist -> concrete class

        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();
        //add

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        //addall
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//
//        list.addAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println("Printing list : " + list2);
//        list2.clear();
//        System.out.println(list2.size());

        // traverse list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("Element : " + iterator.next());
//
//            List<Integer> list3 = new ArrayList<>();
//            list3.add(11);
//            list3.add(12);
//            list3.add(15);
//            System.out.println(list3.get(0));
//            System.out.println("Before set : " + list3);
//            list3.set(0,100);
//            System.out.println("After set : " +list3);
//            //toArray
//            Object[] arr = list3.toArray();
//            for(Object o : arr){
//                System.out.println(o);
//            }

            //contains
//            System.out.println(list3.contains(100));

            //sort
            list.add(60);
            list.add(61);
            System.out.println("Printing entire list " +list);

            //sort an arraylist
            Collections.sort(list);
            System.out.println("Printing entire list " +list);

            //clone
            ArrayList<Integer> newList =  (ArrayList<Integer>) list.clone();
            System.out.println("Printing entire list " +newList);
            ArrayList<Integer> marks = new ArrayList<>();
            marks.ensureCapacity(100);

            //isEmpty
            System.out.println(marks.isEmpty());
            System.out.println(newList.isEmpty());

            //indexOf
           System.out.println(newList.indexOf(60));
        };
    }

