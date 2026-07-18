package Arrays;

public class BasicArray {
    public static void main(String[] args){
        //array declaration
        int arr[];
        //allocation
        arr = new int[5];
        //initialization
        int brr [] = {10,20,30};

//        System.out.println("Value at index 0 " +brr[0]);
//        System.out.println("Value at index 1 " +brr[1]);
//        System.out.println("Value at index 2 " +brr[2]);

        int n = brr.length;

        for(int i=0; i<n; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
            //for each loop
            for(int val:brr){
                System.out.print(val+" ");
            }

    }
}
