package BasicMaths;

public class Palindrome {
    static int reverseDigit(int num){

        int reverseNum = 0;
        while(num!=0) {
            int digit = num % 10;
            reverseNum = reverseNum*10+digit;
            num = num/10;
        }
        return reverseNum;
    }
    static boolean getPalindrome(int num){
        int originalNum = num ;
        int reverseNum = reverseDigit(num);
        if(originalNum== reverseNum){
            System.out.println("Yes it is palindrome");
            return true;
        }
        else{
            System.out.println("It is not palindrome");
            return false;
        }
    }

    public static void main(String[] args){
        boolean ans = getPalindrome(1221);
        System.out.println(ans);
    }
}
