package Arrays;

import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print("provide value for row = " + i + " and provide value for column = " + j );

            }

        }
     for(int i = 0; i < 3; i++) {
         for(int j = 0; j < 4; j++) {
             System.out.print(arr[i][j] + " ");
         }
         System.out.println();
     }

    }
}
