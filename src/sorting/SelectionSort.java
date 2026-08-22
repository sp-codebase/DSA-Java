package sorting;

public class SelectionSort {
    static void getSelectionSort(int[] arr){
        int n = arr.length;;
        //outerloop for rounds
        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            //inner loops and compare
            for(int j = i+1; j < n; j++){

                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }


            }
            int temp = arr[i];
            arr[i] = arr[minIndex];//minIndex becomes j
            arr[minIndex] = temp;

        }
    }
    public static void main(String[] args){
        int[] arr = {6,4,3,5,1};
        getSelectionSort(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
