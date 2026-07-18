package ArraysManipulation;

public class ShiftArray {
    static int[] shiftArray(int[] arr, int  k) {
        //step1: store last element in temp
//        int n = arr.length;
//        int temp=arr[n-1];
//
//       // step2: shift all elements in array
//        for(int i=n-1;i>0;i--){
//            arr[i] = arr[i-1];
//
//
//        }
//        // step 3: store last element at index 0
//        arr[0] = temp;
//    }
//    public static void main(String[] args) {
//        int [] arr = {1,3,4,5,6,6};
//        shiftArray(arr);
//        for(int k:arr){
//            System.out.print(k + " ");
//        }
//        System.out.println();
//    }
        int n = arr.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[(i+k)%n]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] result = shiftArray(arr,k);
       for(int i:result){
           System.out.print(i + " ");
       }
    }

}
