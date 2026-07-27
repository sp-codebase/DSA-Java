package Arrays.Arrays1;

public class MaxElement {
    public static void main (String[] args) {
        int arr[] = { 4, -6, 56, 45,-87};
        int n = arr.length;

        int maxValue  = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxValue) {
                //update maxvalue
                maxValue = arr[i];
                System.out.println("The maximum value in the array is: " + maxValue);
            }
        }
        //System.out.println("The maximum value in the array is: " + maxValue);

    }
}
