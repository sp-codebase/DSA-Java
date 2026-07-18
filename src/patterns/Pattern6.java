public class Pattern6 {
    public static void main(String[] args) {
        int n= 5;
        //row = 5
        //variable columns
        //r1-> 4sp, 1*. r2-> 3sp ,
        for(int row=1; row<=n; row++) {
            //space
            for(int col=1; col<=n-row; col++) {
                System.out.print(" ");

            }
            //stars
            for(int col=1; col<=2*row-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
