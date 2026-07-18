package BasicsJava;

public class PracticeLoop {
    public static void main(String[] args) {

        //print counting from 1 to n

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

        //print counting from n to 1

//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }

        //print the 10 multiples of n

//        for (int i = 1; i <= 10; i ++) {
//            System.out.println("2*" + i + " = " + i * i);
//        }

        // print your name 100 times

//        for(int i = 1; i <= 100 ; i++){
//            System.out.println("Sonal");
//        }

        //print all prime numbers from 1 to 100

//        for (int i = 2; i <= 100; i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(i + " ");
//            }
//        }

        // print even number from 1 to 100
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//
//        }
        //print the num of all numbers from 1 to n

//        int i = 1;
//   int sum = 0;
//        while (i <= 5) {
//            sum += i;
//            i++;
//
//
//        }
//        System.out.println(sum);

        //print all number from 50 to 100 that are perfectly divisible by 7
        for(int i = 50; i<=100; i++){
            if(i % 7== 0){
                System.out.println(i);
            }
        }
    }
}
