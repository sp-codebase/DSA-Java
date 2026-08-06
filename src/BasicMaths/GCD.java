package BasicMaths;

public class GCD {
    static int getgcd(int a, int b){
        // gcd (a,b) = gcd(b, a%b)

        while(b!=0){
            int oldValue = b; // b ko temp main rkho
            b = a%b;//a%b ko b
            a = oldValue; // a ki jagah b ka value

        }
        int ans  = a; // answer a par milega and b par 0 ho jayega
        return ans;
    }

    static int getLCM( int a , int b){
        int gcd = getgcd(a,b);
        int product = a*b;
        int lcm = product/gcd;
        return lcm;
    }

    public static void main( String[] args){
        System.out.println(getLCM(12,18));
    }
}
