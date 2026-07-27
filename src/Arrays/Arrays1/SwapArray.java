package Arrays.Arrays1;

public class SwapArray {

    static int[] getSwapPairs(int[] arr) {

        for(int i= 0; i< arr.length -1; i +=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,2,9,10};
        int[] ans = getSwapPairs(arr);
        for(int i: ans){
            System.out.print(i + " ");
        }

    }
}
