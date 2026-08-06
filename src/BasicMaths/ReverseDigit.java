package BasicMaths;

public class ReverseDigit {
    static int reverseDigit(int num){

        int reverseNum = 0;
        while(num!=0) {
            int digit = num % 10;
            reverseNum = reverseNum*10+digit;
            num = num/10;
        }
        return reverseNum;
    }


    public static void main(String[] args){
        int num = 51732;
        int ans = reverseDigit(num);
        System.out.println(ans);
    }
}
