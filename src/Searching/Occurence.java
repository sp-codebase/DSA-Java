package Searching;

public class Occurence {
    static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<=target){
                start = mid+1;
            }
            else{
                ans = mid;
                end = mid-1;

            }
        }
        return ans;
    }
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
    static int getCountFreq(int[]arr,int target){
        int lbIndex = getLowerBound(arr,target);
        int upIndex = getUpperBound(arr,target);
        int ans = upIndex-lbIndex;
        return ans;
    }

    public static void main(String[] args){
        int [] arr = {10,20,30,30,30,30,30,40,50,60};
        int target = 30;
        System.out.println(getCountFreq(arr,target));
    }
}
