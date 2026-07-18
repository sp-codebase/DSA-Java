public class Pattern10 {
    public static void main(String[]args) {
        // row=5

        int n = 5;
        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                //space
                for (int col = 1; col <= (n - row); col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
            }
            else if (row == n) {

                //space
                for (int col = 1; col<=(n-row); col++) {
                    System.out.print(" ");
                }
                //stars
                for (int col = 1; col <= 9; col++) {
                    System.out.print("*");
                }


            }
            else {
                // r=2,3,4
                //space
                for (int col = 1; col <= n - row; col++) {
                    System.out.print(" ");
                }
                //star
                System.out.print("*");
                //space
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
