package Arrays;

public class FirstAndLastSwap {

    public static int[] getFirstAndLastSwap(int[] arr) {
        int temp = arr[0]; // creating temporary value
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;
    }
     public static void main(String[] args) {
        int[] arr = {1,3,6,2,9};
        int[] ans = getFirstAndLastSwap(arr);
        for(int i: ans){
            System.out.println(i);
        }


     }

}
