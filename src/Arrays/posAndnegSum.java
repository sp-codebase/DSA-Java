package Arrays;

public class posAndnegSum {

    public static int[] getPosNegSum(int arr[]){
        int posSum = 0;
        int negSum =0;

        for(int i = 0; i <arr.length; i++){
            if(arr[i]>0){
                posSum = posSum + arr[i];
            }
            else{
                negSum = negSum + arr[i];
            }
        }

        int ans[] = {posSum, negSum};
        return ans;
    }
    public static void main(){
        int arr[] = {1, 3, -7,4,-11};
        int ans[] = getPosNegSum(arr);
        System.out.println("The posSum is: " +ans[0]);
        System.out.println("The negSum is: " +ans[1]);
    }
}
