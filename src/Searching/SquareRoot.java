package Searching;

public class SquareRoot {
    static double findSquareRoot(int x){
        int s = 1 ;
         int e = x;
         double ans = -1;

         while(s<=e){
           int mid = s +(e-s)/2;

             if(mid == x/mid){
                 return mid;
             }

             else if ( mid > x/mid){
                 e = mid -1;
             }
             else {
                 ans = mid;
                 s = mid+1;
             }
         }

        double factor = 1;
        int totalPrecision = 3;
        for(int round = 1; round<=totalPrecision; round++) {
            factor = factor / 10;

            for (int i = 1; i <= 10; i++) {
                double newAns = ans + factor;

//                if (newAns * newAns == x) {
//                    ans = newAns;
//                }
                 if (newAns * newAns <= x) {
                    ans = newAns;
                } else {
                    break;
                }

            }
        System.out.println("Iss round ka final ans is :" +Math.round(ans * 1000.0)/1000.0);
        }

        System.out.println("Final ans is :" +Math.round(ans * 1000.0)/1000.0);
                return ans;
    }

    public static void main(String[] args){
        double result = findSquareRoot(56);
        System.out.println(result);
    }
}
