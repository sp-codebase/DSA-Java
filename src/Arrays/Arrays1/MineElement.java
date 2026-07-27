package Arrays.Arrays1;

public class MineElement {
    public static void main(String[] args) {

        int arr[] = {0, 4, -9, 4};
        int n = arr.length;
        int minvalue = 0;

        for(int i=0;i<n;i++){

            if(arr[i]<minvalue){
                minvalue = arr[i];
                System.out.println("The minimum value in the array is: " + minvalue);
            }
        }
    }
}
