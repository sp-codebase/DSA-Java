package Arrays.TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class SumWaveOfmatrix {
    static List<Integer> getSum(int[][] arr ){
        List<Integer> list = new ArrayList<>();
        int m = arr.length;//row
        int n = arr[0].length;//col

        //first traverse strats from col
        for(int col = 0; col< n; col++){
            int sum = 0;
            if((col & 1)== 1){
                for( int row= m-1 ; row >=0 ; row-- ){
                    list.add(arr[row][col]);

                }
            }
            else {
                for(int row = 0; row < m; row++){
                    list.add(arr[row][col]);

                }

            }
        }
        return list;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(getSum(arr));
    }
}
