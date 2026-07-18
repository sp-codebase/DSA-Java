package BasicsJava;

public class Method {
   //method declaration
    static void print2Table() {
        for(int i = 1; i<=10; i++){
           int ans = 2*i;
           System.out.println(ans);
        }
    }
    static void printSum(int x , int y) {//parameters
        System.out.println("value of sum is : " + (x+y));
    }

   static void printMultiply(int x , int y){
        System.out.println("value of multiply is : " + (x*y));
        return;
    }
    //method overloading- same name , different parameters
    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    static int add(int a, int b,int c){
        int sum1 = a+b+c;
        return sum1;
    }
    //call by value = passing copy
    static void solve(int num){
        System.out.println("Inside solve : " + (num));
        num = num*10;
        System.out.println("Inside solve : " + (num));
    }
    static void printSolve2(){
        int value = 20;
        for(int i = 1; i<=10; i++){
            System.out.println(20*i);
        }
        System.out.println("The value is : " +value);
    }
    static void main() {
        //method = entity enable us to reuse the block of code
        //basic syntax
//        returnType methodName(parameters){
//                //method body
//        }
//         printSum(1,2);//arguments
//        printMultiply(2,2);

//        int result1 = add(1,2);
//        int result2 = add(3,4,5);
//        System.out.println(result1);
//        System.out.println(result2);

//         int num = 5;
//         System.out.println("inside main " + num);
//         solve(num);
//         System.out.println("inside main " + num);
          printSolve2();
    }
}
