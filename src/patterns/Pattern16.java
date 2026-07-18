/*
********
 *****
  ***
   *
  ***
 *****
********
 */
public class Pattern16 {
    public static void main(String[] args) {
        int n= 4;

        //part1 - inverted  pyramid
        //row=4 , for each row column varies
        //7=2*(4-1)+1, 5=2*(4-2)+1, 3=2*(4-3)+1
        for(int row=1;row<=n;row++){
            //space
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            //star
            for(int col=1;col<=2*(n-row)+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //part 2 = pyramid
        for(int row=1;row<=n;row++){
            if(row==1){
                continue;
            }
            //space
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
