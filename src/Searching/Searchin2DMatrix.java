package Searching;

public class Searchin2DMatrix {

     public static boolean searchMatrix(int[][] matrix, int target){
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int n = totalRow*totalCol;

        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int rowIndex = mid/totalCol;//the first integer of current row is greater than previous row
            int colIndex = mid % totalCol;

            if(matrix[rowIndex][colIndex] == target){
                return true;
            } else if (matrix[rowIndex][colIndex] < target) {
                //move to right

                s=mid+1;

            }
            else{
                e = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args){
         int [][] matrix = {
                 {1,3,5,7},{10,11,16,20},{23,30,34,60}
         };

         System.out.println(searchMatrix(matrix,16));

    }



}
