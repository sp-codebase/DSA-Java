

public class ReverseArray {

    static void reverse(int[] arr){
        int n = arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            //i ko aage badhana
            i++;
            // j ko piche lana
            j--;
        }
        //print

        }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(arr);
        for(int k:arr) {
            System.out.print(k + " ");
        }
    }
}
