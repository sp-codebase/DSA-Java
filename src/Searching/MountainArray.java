package Searching;

public class MountainArray {
    static int getArray(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]<arr[mid+1]){
                //main asecndin order waalein part me hu
                // iska mtlb left part
                // and ans rit main h
                // then move to right
                s = mid +1;

            }
            else{
                //arr[mid]>=arr[mid+1]
                //rigth part main hian

                ans = mid;

                e = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {10,20, 30 , 40 ,40 , 70 , 35, 25};
        System.out.println(getArray(arr));
    }
}
