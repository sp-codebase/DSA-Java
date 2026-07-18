package patterns;

public class Pattern20 {
    public static void main(String[] args){
         int n = 4;

//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=row;col++){
//            System.out.print((row+col+1)%2 + " ");
//
        //part1
        //stars
        for(int row=1;row<=n; row++){
            if(row==1 || row==n){
                for(int col=1;col<=n;col++){
                    System.out.print("* ");
                }
            }else{
                //stars
                System.out.print("* ");
                //space
                for(int col=1;col<=2;col++){
                    System.out.print("  ");
                }
                //stars
                System.out.print("* ");
            }


           System.out.println();
        }









    }
}
