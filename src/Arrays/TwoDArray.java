package Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        //declarartion
        int [][] matrix;
        // allocation
        matrix = new int[3][4];
        //initialization

        int [][] arr = {
                {2,3,4},{3,4,5},{5,6,7}
        };

        int rowLength = arr.length;
        int colLength = arr[0].length;

        for(int row=0;row<rowLength;row++){
            for(int col=0;col<colLength;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
