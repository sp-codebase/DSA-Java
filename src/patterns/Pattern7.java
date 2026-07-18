public class Pattern7 {
    public static void main(String[] args) {
        int n= 4;
        // row=4
        //r1 = 7 * , r2 = 1 sp, 5*, r3 = 2 sp, 3*, r4=3 sp, 1*
        // space = row-1
        // stars = 2*n-2row+1
        for(int row=1;row<=n;row++){
          //space
            for(int col=1;col<=row-1;col++){
                 System.out.print(" ");
            }
            //stars
            for(int col=1;col<=2*n-2*row+1;col++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
