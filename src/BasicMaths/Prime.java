package BasicMaths;

import java.util.Scanner;

public class Prime {
    static boolean IsPrime(int nums){

//        for(int i=2; i < nums; i++){
//            if(nums % i ==0){
//                return false;
//            }
//
//        }
//        return true;
        for(int i = 2 ; i*i <= nums; i++){// for bigInt
            if (nums % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value");
        int nums = sc.nextInt();

        System.out.println(IsPrime(nums));
    }

}
