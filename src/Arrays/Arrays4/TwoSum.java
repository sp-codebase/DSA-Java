package Arrays.Arrays4;
import java.util.*;

public class TwoSum {

    public static int[] getTwoSum(int[] arr, int target){

        int n  = arr.length;

        for ( int index = 0; index < n ; index++ ){
            for(int nextIndex = index+1; nextIndex < n; nextIndex++ ){
                if (arr[index] + arr[nextIndex] == target){
                    int[] ans = new int[]{arr[index], arr[nextIndex]};

                    return ans;
                }
            }
        }
        int[] ans = new int[]{};
        return ans;
    }

    public  static void main(String[] args) {
        int[] arr = {2,7,11,3,1};
        int target = 9;
        int[] ans = getTwoSum(arr,target );
        System.out.println(Arrays.toString(ans));

    }
}
