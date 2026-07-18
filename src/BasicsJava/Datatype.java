package BasicsJava;

public class Datatype {
    static void main() {
        byte num = 127; //-128 to 127
        System.out.println(num);

        short num2 = 127; //-32768 to 32767
        System.out.println(num2);

        int num3 = 12700000;
        long num4 = 127000000;

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 3.1445f; // neary 6 precision
        System.out.println(num5);
        double num6 = 3.1467899044;
        System.out.println(num6);

        char myFirstCharacter = 'a';
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
        System.out.println("myFirstCharacter is " + myFirstCharacter);

        //implicit conversion
        long newNum = num;
        System.out.println(newNum);
         //int 32 bit , long 64 bit
        //explicit conversion
        long value1 = 1234567866;
        int value2 = (int)value1;
        System.out.println(value2);

    }
}
