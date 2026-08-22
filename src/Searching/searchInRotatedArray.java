package Searching;

public class searchInRotatedArray {
    //first pivot index concept

    static int findPivotindex(int [] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        if(arr[0]<arr[n-1]){
            return -1;
        }
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]<arr[n-1]){
                //l2 main h
                // ans l1 main h
                // move left
                e = mid-1;
            }
            else{
                //l1 main h
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
    //binary search
    static int getbinarySearch(int [] arr,int s, int e, int target){
        int n = arr.length;

         while(s<=e){
             int mid = s + (e-s)/2;
             if(arr[mid]==target){
                 return mid;
             }
             else if(arr[mid]< target){
                 //less than hua mtlb target right side hoga
                 s = mid +1;
             }
             else{
                 e = mid-1;
             }
         }
         return -1;
    }
    static int search(int[]arr, int target){
        int pivotIndex = findPivotindex(arr);
        int n = arr.length;
        //pivot index - 1 arr is already sorted

        if(pivotIndex == -1){
            int ans = getbinarySearch(arr, 0, n-1,target);
            return ans;
        }
        else {
            //array is not sorted or rotated sorted

            // array can be divided into l1 and l2
            //indexed for l1
            int startArray1= 0;
            int endArray1 = pivotIndex;

            if(target >= arr[startArray1] && target<= arr[endArray1]){
               int ans = getbinarySearch(arr,startArray1,endArray1,target);
               return ans;
            }
            int startArray2 = pivotIndex+1;
            int endArray2 = n-1;

            if(target>= arr[startArray2] && target <= arr[endArray2]){
                int ans = getbinarySearch(arr,startArray2,endArray2,target);
                return ans;
            }


        }

       return -1;

    }

    public static void main(String[] args){
        int [] arr = {50,60,70,10,20,30};

        System.out.println(search(arr, 60));
    }
}
