package Arrays;

public class unsortedElement {
    static int findUnsorted(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,6,2,9};
        System.out.println(findUnsorted(arr));
    }
}
