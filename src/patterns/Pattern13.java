import java.util.Scanner;

public class Pattern13
{
    public static void main(String[] args){



        int n = 4;


      for(int row=1; row<=n; row++) {
          //part 1
          for (int col = 1; col <= row; col++) {
              System.out.print("* ");
          }


          //part 2
          for (int col=1; col <= 2*(n-row); col++) {
              System.out.print("  ");
          }


          //part 3
          for (int col=1; col<=row; col++) {
              System.out.print("* ");

          }
          System.out.println();

      }
      //inverted
      for(int row=1; row<=n; row++) {
          //part 4
          for (int col = 1; col <=(n-row)+1; col++) {
              System.out.print("* ");

          }

          //part5
          for (int col=1; col<=2*(row-1); col++) {
              System.out.print("  ");
          }
          //part 6
          for (int col=1; col<=n-row+1; col++) {
              System.out.print("* ");
          }
          System.out.println();
      }

    }
}
