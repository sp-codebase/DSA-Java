package Arrays.Arrays1;

public class Practice1 {
    public static void main(String[] args) {

        //sum all array

        int arr[] = {10,0,99,43,76};

        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println("Sum of all the elements in the array is: " + sum);


        //multiply all array elements


        int ans =1;

        for (int value : arr) {
            ans = ans * value;
        }
        System.out.println("Multiply of all the elements in the array is: " + ans);

    }

}
