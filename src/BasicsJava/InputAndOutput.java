package BasicsJava;

import java.math.BigInteger;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();


        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int answer = firstNumber+secondNumber;
        System.out.println( "Answer : " + answer);

        BigInteger bg = sc.nextBigInteger();
        System.out.println( "Answer : " + bg);

        System.out.println("Enter the value for flag : ");
        boolean flag = sc.nextBoolean();

        System.out.println( "Enter the value for shortval : ");
        short shortval = sc.nextShort();
        System.out.println( "Enter the value for floatval : ");
        float floatval = sc.nextFloat();

        System.out.println("flag is : " + flag);
        System.out.println("short value : " + shortval);
        System.out.println("float value : " + floatval);

        sc.close();

    }
}
