package Searching;
import java.util.Arrays;
public class CowAggresive {

    static boolean isValidAns(int[] stalls, int k , int minDist){
        int cowCount = 1;
        // cow 1 is placed at 0 index
        int lastPosition =0;

        for(int i = 1; i < stalls.length ; i++){
            //cow ko tab place krene jab stalls[i] - stalls[lastPosition] >= minDist

            if(stalls[i] - stalls[lastPosition] >= minDist){
                  cowCount++;
                   //means lastPosition ko bi update krna
                lastPosition = i;

                if(cowCount == k){
                    //means all cow placed
                    return true;

                }
            }
        }
         return false;
    }
    //Minimum distance between any two cows is as large as possible
    //The objective is to calculate the possible minimum distance between any two cows
     static int binarySearch(int[] stalls, int k){
       Arrays.sort(stalls);
       int start = 0;
       int n = stalls.length;
       int end = stalls[n-1]-stalls[0];
       int ans = -1;


       while(start<=end){
           int mid = start+(end-start)/2;
           if(isValidAns(stalls,k, mid)){
               //possible solution -> move right
               ans = mid;
               start = mid+1;
           }
           else{
               // no arrangement possible to place cows
               end = mid -1;
           }
       }
       return ans;
    }
    public static void main(String[] args){
        int[] stalls = {2,4,8,1,9};
        System.out.println(binarySearch(stalls,3));
    }
}
