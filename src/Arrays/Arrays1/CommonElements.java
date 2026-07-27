package Arrays.Arrays1;

public class CommonElements {

    public static void main(String[] args){
        int arr[] = { 1,2,3,4,5,6};
        int brr[] = {1,5,8,3,77,88};

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<brr.length; j++){
                if(arr[i]==brr[j]){
                    System.out.println(arr[i] + " ");
break;
                }
            }
        }


    }
}
