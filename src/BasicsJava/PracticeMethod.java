package BasicsJava;

public class PracticeMethod {
    //create a method printwelcomemessage that print greeting

    static void printWelcome(){
        System.out.println("greeting");
    }

    //create a method add(int a , int b) returns the sum
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    //create a method iseven(int numbers) that returns true if number is even
    static boolean isEven(int num) {
        if (num % 2 == 0) {

            return true;
        } else {
            return false;
        }
    }

    //create a method getmax(int a , int b) that returns the larger number
    static int getMax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    //create a method calculatepercentage(int obtained, ont total)
    static double calculatePercentage(int obtained , int total){
        double percentage = (obtained * 100.0) / total;
        return percentage;
    }

    //create an overload method display with one int parameter or one string

    static void display(int number){
        System.out.print("Number" + number);
    }
    static void display(String text){
        System.out.print("Text" + text);
    }

    //write a method updateValue(int x) and verify the original variable main() does not change
    static void updateValue(int x){
        System.out.print("Inside value " +x);
         x = x +10;
         System.out.println("Inside value " +x);

    }
     static void main(String[] args){
//        printWelcome();
//        int result = add(1,2);
//        System.out.println(result);

//       boolean result = isEven(10);
//       System.out.println(result);
//         int ans = getMax(1,2);
//         System.out.println(ans);
//         double result = calculatePercentage(1,2);
//         System.out.println("Percentage" + result + "%");
//         display(10);
//         display("Sonal");

         int x = 20;
         System.out.println(x);
         updateValue(x);
         System.out.println("Inside main " +x);
    }
}
