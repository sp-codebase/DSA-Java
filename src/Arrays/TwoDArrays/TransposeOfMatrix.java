package Arrays.TwoDArrays;

public class TransposeOfMatrix {
    static int[][] getTransposeOfMatrix(int[][] matrix){
       if (matrix == null || matrix.length == 0 ){
           return new int[0][0];
       }
       int totalrows = matrix.length;
       int totalcol = matrix[0].length;

       int newtotalrows = totalcol;
       int newtotalcol = totalrows;

       int ans[][]  = new int[newtotalrows][newtotalcol];
       for(int i = 0; i < totalrows; i++){
           for(int j = 0; j < totalcol; j++){
               // purane wale matrix ke i aur j par naya matrix
               // bano jisepe rows = j , col = i

               ans[j][i] = matrix[i][j];


           }
       }
       return ans;
    }

    public static void main(String[] args){
        int[][]  matrix = {
                {1,2,3},{4,5,6},
                {7,8,9}
        };

        int[][] result = getTransposeOfMatrix(matrix);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

