package Arrays.Arrays4;

public class RemoveDuplicatesfromSortedArray {
    static int getRemoveDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0 ;
        int j = 1;
        while ( j < n ){
            if (arr[i] == arr[j] ){
                j++;
            }
            else//when not equal
            {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        int[] arr = {-20,-20,-16,-10,-2,-1,4,8,9,10,12,20};
;
         int size = getRemoveDuplicates(arr);

        for(int i = 0; i < size; i++ ){
            System.out.print(arr[i] + " ");

        }
    }
}
