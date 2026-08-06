package Arrays.TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfCol {

    static List<Integer> SumOfArray(int[][] arr){

        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;



        for(int col = 0; col < n; col++){
            int sum =0;

            for(int row = 0; row <m; row++){

             int value = arr[row][col];
                sum = sum + value;// col add krne ke liye row krenge add

            }
            list.add(sum);

        }
        return  list;

    }

    public static void main (String[] args){
        int [][] arr = {{1,4,5}, {6,7,8}, {1,8,6}};
        System.out.println(SumOfArray(arr));
    }
}


