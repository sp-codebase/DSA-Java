package Searching;

public class LowerBound {
    static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans= -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]>= target){
                // ans store
                ans = mid;
                //move to left
                end = mid -1;
            }
            else {
                start = mid+1;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,30,30,30,40};
        int target = 30;
        int ans = getLowerBound(arr, target);
        System.out.println("ans: " +ans);
    }

}
