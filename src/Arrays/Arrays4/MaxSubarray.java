package Arrays.Arrays4;

public class MaxSubarray {
    static int maxSubArray(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
            //step 1 create sum
            sum = sum + arr[i];
            //step 2 max
            max = Math.max(max , sum);
            //step 3 sum check
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main (String[] args){
        int [] arr = { -2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
