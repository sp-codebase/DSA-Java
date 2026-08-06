package BasicMaths;

public class CountDigit {
    static int getCountDigit(int num){

        int count = 0;
        while(num!=0) {
            int digit = num % 10;
           count++;
           num = num/10;
        }
        return count;
    }


    public static void main(String[] args){
        int num = 51732;
        int ans = getCountDigit(num);
        System.out.println(ans);
    }
}
