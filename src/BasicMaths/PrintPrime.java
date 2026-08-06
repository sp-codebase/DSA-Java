package BasicMaths;

public class PrintPrime {

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


    static void printPrint(int num) {
        //print all number from 1 to n
        // 1 is not prime number
        // check whether prime

        for (int i = 2; i <= num; i++) {
            boolean isPrime = IsPrime(i);
            if (isPrime) {
                System.out.println(i);
            }

        }


    }

    public static void main (String[] args){
        int num = 10;
        printPrint(num);
    }
}
