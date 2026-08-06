package Arrays.TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfRows {
    static List<Integer> SumOfArray(int[][] arr){

        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;


        // first row traverse for each row then column traverse and then add each column of each row

        for(int row = 0; row < m; row++){
            int sum = 0;// row ke jaane ke baad sum pka column
            for(int col = 0; col <n; col++){
                int value = arr[row][col];

                sum = sum + value;

            }
            list.add(sum);// column ka add krek list main dalna phir next row

        }
        return  list;

    }

    public static void main (String[] args){
        int [][] arr = {{1,4,5}, {6,7,8}, {1,8,6}};
        System.out.println(SumOfArray(arr));
    }
}
