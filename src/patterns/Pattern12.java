//hollow diamond
public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        //part 1
        for(int row=1;row<=n;row++){

            //space
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            //star
            if(row==1){

                System.out.print("*");



            }
            else {
                //stars
                System.out.print("*");


                //space
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print(" ");
                }
                //star
                System.out.print("*");
            }

            System.out.println();
        }

        //part 2

        for(int row=1;row<=n-1;row++){
            //
            //space
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            //star
            if(row==n-1){
                System.out.print("*");
            }
            else{
                //1 *
                System.out.print("*");

                //2(n-r)-3
                for(int col=1;col<=2*(n-row)-3;col++){
                    System.out.print(" ");
                }
                //1*
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
