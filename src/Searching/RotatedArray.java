package Searching;

public class RotatedArray {

    static int findPivotIndex(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        if(arr[0]<arr[n-1]){
            return -1;
        }

        while(s <= e){
            int mid = s + ( e-s)/2;
            if(arr[mid]<=arr[n-1]){
                //l2 par h
                // ans in l1
                // move left
                 e= mid-1;

            }
            else{
                //l1 par h toh
                //ans store
                ans = mid;
                // move right
                s = mid+1;
            }
        }



       return  ans;
    }
    public static  void main(String[] args){
//        int[] arr = { 50, 60 , 70 , 10 , 20 , 30 , 40};
        int[] arr = {-66,-67};
        System.out.println(findPivotIndex(arr));
    }
}
