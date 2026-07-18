package CollectionFramework;

import java.util.Scanner;

public class BitwiseOperators {


    public static void main(String[] args) {
//        int a = 5;//00000101
//        int b = 7;//00000111
//
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//
//        System.out.println(~a);// 1's complementary ->~n = -(n + 1) -> after again find 2's complement

//        int n = 1;
//        for(int i= 1; i <=32; i++){ //n multiply 2
//            n = n << 1;
//            System.out.println(n);
//
//        }

//        int n = 5;
//        for(int i=0;i<18;i++){// divide by 2
//            n = n >> 1;
//            System.out.println(n);
//        }

//        int n = 11;
//        if((n&1)==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }

        //set bit which value is 1

//        int n = 13;
//        int count = 0;
//
//        while (n != 0) {
//            if ((n & 1) != 0) {
//                count++;
//            }
//
//            n = n >> 1;   // Shift every iteration
//        }
//
//        System.out.println(count);

        //power of 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        if ((n & n-1) == 0) {
            System.out.println("n is a power of 2");
        }
        else {
            System.out.println("n is not a power of 2");
        }

    }

}
