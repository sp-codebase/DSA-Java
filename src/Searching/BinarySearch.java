package Searching;

public class BinarySearch {
    static int getBinarySearch(int [] arr, int key){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                return mid;
            } else if (arr[mid]<key) {
                start = mid+1;

            }
            else{
                end = mid-1;
            }
//            int mid = start + (end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        System.out.println(getBinarySearch(arr,14));
    }
}
