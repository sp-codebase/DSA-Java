//Hollow square
//*****
//*    *
//*    *
//******
public class Pattern8 {
    public static void main(String[] args) {
        int n= 4; //total rows

        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                //row which are equal
                if(i==1 || i==n) {
                    System.out.print("*");
                }else{
                    // row not equal
                     if(j==1 || j==6 ) {
                         System.out.print("*");
                     }
                  else{
                      System.out.print(" ");
                     }
                }

            }
            System.out.println();
        }
    }
}
