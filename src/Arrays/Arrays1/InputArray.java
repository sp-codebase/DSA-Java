package Arrays.Arrays1;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print("Provide input for index " + i);
            arr[i] = sc.nextInt();
        }

        //print
      System.out.println("Array Elements are: ");
        for(int val :arr){
            System.out.print(val);
//            for(int i = 0; i<=n-1;i++){
//                System.out.print( arr[i]);
            }

    }
}
