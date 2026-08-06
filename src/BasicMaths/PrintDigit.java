package BasicMaths;

public class PrintDigit {
   public static void getPrintdigit(int num){

        while(num!=0){
          int digit =   num%10 ;
          System.out.println(digit);
          num = num/10;
        }

    }

    public static void main(String[] args){
        int num = 51732;
        getPrintdigit(num);
    }


}
