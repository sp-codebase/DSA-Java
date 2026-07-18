public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        //int cnt=1;
//        for (int row=1; row<=n; row++) {
//            for (int col=1; col<=row; col++) {
//                System.out.print(cnt+" ");
//                cnt++;
//            }

//
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++) {
                int a = n-col;
                int b = 'A';
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns+" ");
            }
            System.out.println();
        }

    }
}
