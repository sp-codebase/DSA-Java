package BasicMaths;

public class SumDigit {

    static int getsumDigit(int num){

        int sum = 0;
        while(num!=0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }


    public static void main(String[] args){
        int num = 51732;
        int ans = getsumDigit(num);
        System.out.println(ans);
    }
}
