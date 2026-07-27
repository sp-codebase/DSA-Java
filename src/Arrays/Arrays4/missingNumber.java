package Arrays.Arrays4;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class missingNumber {

    private static Math Maths;

    static List<Integer> getMissingNum(int[] arr){
        List<Integer> ans = new ArrayList<>();

        //marking
        int n = arr.length;
        for(int index = 0; index < n; index++){
            int value = Maths.abs(arr[index]);
            int position = value -1 ;
            //mark the position
            if(arr[position] > 0 ){
                arr[position] = - arr[position];
            }
        }

        //travel array and wheneevr encounter positive value print the same number
        // at same time

        for(int index = 0 ; index < n ; index++){
            if(arr[index] > 0){
                int valueAtTheIndex = index + 1;
                ans.add(valueAtTheIndex);
            }
        }

        return ans;

    }

    public static void main(String[] args){
        int[] arr = {1,4,4,5,2,2,};

        System.out.print(getMissingNum(arr));
    }
}

