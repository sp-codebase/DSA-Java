package Arrays.TwoDArrays;

public class RotateMatrix {
    static int[][] getRotate(int[][] matrix, int N) {
        //step 1; transpose using swap
        for (int row = 0; row < N; row++) {
            for (int col = row+1; col < N; col++) {
                int temp = matrix[row][col];//store matrix in temp
                matrix[row][col] = matrix[col][row];// storing matrix by reveresing col and row
                matrix[col][row] = temp;
            }
        }
        //reverse rows using pointer
        for (int Newrow = 0; Newrow < N; Newrow++) {
            int startCol = 0;
            int endCol = N - 1;
            while (startCol <= endCol) {
                //swap matrix
                int temp = matrix[Newrow][startCol];
                matrix[Newrow][startCol] = matrix[Newrow][endCol];
                matrix[Newrow][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3}, {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = getRotate(matrix,3);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}