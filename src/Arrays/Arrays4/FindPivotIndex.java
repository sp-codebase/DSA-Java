package Arrays.Arrays4;

public class FindPivotIndex {

    //the value which left side and right sum is exactly equal in an array = pivot index

    static int getPivotindex(int[] arr){
        int n = arr.length;
        int LeftSum[] = new int[n];
        int RightSum[] = new int[n];

        //first leftwala sum

        LeftSum[0] = arr[0];
        for(int i = 1; i <= n-1; i++){
            LeftSum[i] = LeftSum[i-1]+arr[i];
        }

        RightSum[n-1] = arr[n-1];
        for(int i = n-2; i >= 0;  i--){
            RightSum[i] = RightSum[i+1]+arr[i];
        }
  //check for equality
       for(int i = 0 ; i < n ; i++){
        if(LeftSum[i]==RightSum[i]) {
            return arr[i];// when we want valuw
            //return i;// whne we want index
        }
        }

       return -1;

    }

    public static void main(String[] args){
        int[] arr = {1, 7,3,6,5,6};
        System.out.print(getPivotindex(arr));
    }

}
