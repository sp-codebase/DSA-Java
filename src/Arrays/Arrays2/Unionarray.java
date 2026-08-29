package Arrays.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class Unionarray {

    static List<Integer> getUnionarray(int[] arr, int[] brr){

//        Set<Integer> union = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num:arr){
            list.add(num);
        }
        for(int num:brr){
            list.add(num);

        }

        return list;





    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 1, 7, 9, 7, 5, 5, 5};
        int[] brr = { 1,3,7,8,9,2,3};

        System.out.println(getUnionarray(arr,brr));
    }
}
