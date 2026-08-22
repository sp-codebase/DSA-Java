package sorting;

public class InsertionSort {
    static void getSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;

            }
        }
    }

    public static void main(String[] args){
        int[] arr = {5,3,6,1};
        getSort(arr);
        for(int num: arr){
            System.out.print(num);
        }
    }
}
