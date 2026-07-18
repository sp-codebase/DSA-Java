//row=outer loop, column=inner loop
//check no. of rows, for each row no. of columns

//1. Solid square pattern

//no. of rows =4 , row(1,4)
//no. of columns for each rows = 4
//analyze each row -> formula =

public class Pattern1 {

    public static void main(String[] args) {

        int n = 4;

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
