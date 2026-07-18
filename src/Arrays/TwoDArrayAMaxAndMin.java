package Arrays;

public class TwoDArrayAMaxAndMin {
    public static void main(String[] args) {

        int [][] arr = {
                {23,45}, {4, -76}, {34, -21}
        };

        int MaxValue = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > MaxValue) {
                    MaxValue = arr[i][j];

                }

            }
        }
        System.out.println("The maximum value in the array is: " + MaxValue);

        int MinValue = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < MinValue) {
                    MinValue = arr[i][j];
                }
            }
        }
        System.out.println("The minimum value in the array is: " + MinValue);


    }
}
