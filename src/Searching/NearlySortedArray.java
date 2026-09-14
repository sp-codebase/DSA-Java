package Searching;

public class NearlySortedArray {
    static int NearlySortedArray(int[] arr, int k)
    {
        int n = arr.length;
        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(mid-1 >= 0 && arr[mid+1]==k){
                return mid+1;
            }
            else if(mid+1 < 0 && arr[mid-1]==k){
                return mid-1;
            } else if (k > arr[mid]) {
                //move to right
                s = mid +2;

            }
            else{
                e = mid - 2;
            }
        }
        return -1;
    }
    public static  void main(String[] args){
        int[] arr = {3,5,10,9,11};
        System.out.println(NearlySortedArray(arr,10));
    }
}
