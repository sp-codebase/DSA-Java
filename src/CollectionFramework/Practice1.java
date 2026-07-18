package CollectionFramework;

public class Practice1 {
    public static void main(String[] args) {
//        1.
//        Write a program to count number of set bits
        //set bit -> value of 1

        int n = 5;
        int count = 0;
        while (n != 0) {
            if((n & 1) != 0) {
                count ++;
            }
            n = n >> 1;
        }
        System.out.println(count);

//       4.
//Check if number is power of 4

        int m = 16;
        if((m & (m-1)) == 0) {
            System.out.println("m is a power of 2");
        }

    }
}
