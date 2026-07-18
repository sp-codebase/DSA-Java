public class pattern19 {
    public static void main(String[] args) {
        int n=4;
        for(int row=1;row<=n;row++){
            //part1-space
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            //part2
            for(int col=1;col<=row;col++){
                int a = col;
                int b = 'A'-1;
                int ans = a+b;
                char finalAns =(char)ans;
                System.out.print(finalAns +" ");

            }

            //part4
            for(int col=1;col<=row-1;col++){
                char toPrint = (char)(row+'A' -2);
                System.out.print(toPrint +" ");
                toPrint--;
            }
            System.out.println();
        }
    }
}
