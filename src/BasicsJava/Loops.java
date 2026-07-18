package BasicsJava;

public class Loops {
    public static void main(String[] args) {


        //for loop
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Value of i  " +i);
//        }

//        for (int i = 1; i <= 10; i +=2) {
//            System.out.println("Value of i  " +i);
//        }

        //nested loops
//        for (inti = 1; i <= 3; i ++) {
//            for (int j = 1; j <= 3; j ++) {
//                System.out.print("*" );
//            }
//            System.out.println();
//        }

//        for(int i = 1; i <= 3; i++){
//            for(int j = 1; j <= 3; j++){
//                System.out.print(" i = " + i + " , j = " + j);
//            }
//            System.out.println();
//        }

        // Break and continue

//        for (int i = 1; i <= 10; i++) {
//            if(i==5){
//                break;//code exit
//            }
//             System.out.println(i);
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            if(i==5){
//                continue;// exclude 5 only
//            }
//            System.out.println(i);
//        }

        //while

//        int i = 1; //initialization
//
//        while (i <= 10){//condition
//            System.out.println(i);
//            i++;//update
//        }

        //nested while
//        int i = 1;
//        while (i <= 2){
//            int j= 1;
//            while(j <= 3){
//                System.out.println("i = " + i +  " , j = " + j);
//                j++;
//            }
//            i++;
//
//        }

        // do-while - no condition check atleast one time code will execute

        int i = 1;//initialization
        do {
            System.out.println(i);
             i++; // updation
        }
        while (i <= 5); // condition



    }

}
