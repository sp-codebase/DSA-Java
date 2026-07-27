package Arrays.Arrays1;

public class zeroOneCount {

    static int[] getZeroOneCount(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            else if(arr[i]==1){
                oneCount++;
            }
        }
        int ans[]= {oneCount, zeroCount};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,4,0,2,1,1,0,0};
        int ans[]  = getZeroOneCount(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
