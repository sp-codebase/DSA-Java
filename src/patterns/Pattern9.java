//hollow right angled tringle
/*
*
* *
*   *
*     *
* * * * *
 */
public class Pattern9 {
    public static void main(String[] args) {
        // rows=5, column variable for each rows
        int n = 5;
        for(int row=1;row<=n;row++){
            //for each row-> variable column
            if(row==1 || row==2 || row==n){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }

            }
            else{
                //1*
                System.out.print("* ");
                //2sp
                for(int col=1;col<=(row-2);col++){
                    System.out.print("  0");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
