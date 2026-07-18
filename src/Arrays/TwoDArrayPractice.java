package Arrays;

public class TwoDArrayPractice {
    public static void main(String[] args) {
       //sum
        int [][] arr =  {{1,2,3},{4,5,6},{7,8,9}};


        int sum = 0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                int arrVal = arr[i][j];
                sum += arrVal;

            }

        }
        System.out.println(sum);

        int ans =1;
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        int arrVal = arr[i][j];
        ans += arrVal;
        }
        }
        System.out.println(ans);
    }
}
