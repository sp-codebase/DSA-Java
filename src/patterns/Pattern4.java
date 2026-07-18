//solid rhombus
public class Pattern4 {
    public static void main(String[] args){
        int n= 5;
        for(int row=1;row<=n;row++){
            //for eac row -> space and stars
            //spaces
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            //stars
            for(int col=1;col<=5;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
