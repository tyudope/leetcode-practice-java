package matrix;

import java.util.Arrays;

public class RotateImage {
    // You are given n x n 2D matrix representing an image, rotate the image by 90 degrees(clockwise)
    // You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
    // DO NOT Allocate another 2D matrix and do the rotation.
    public static void main(String[] args) {

        // test case.
        int[][] matrix = {

                {1,2,3},
                {4,5,6},
                {7,8,9},
        };


//        rotate(matrix);
//
//        for(int [] row : matrix){
//            System.out.println(Arrays.toString(row));
//        }

        rotateWithTranspoe(matrix);
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }

    }
    // Transpose and reverse the rows solution.
    public static void rotateWithTranspoe(int[][] matrix){

        // we transposed the matrix successfully.
        for(int row = 0; row < matrix.length; row++ ){
            for(int column = row; column < matrix.length; column++){
                int temp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = temp;
            }
        }
        // now we have to reverse every row in our matrix.

        for(int[] row : matrix){
            for(int i = 0; i < row.length / 2; i++){
                int temp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length -1 -i] = temp;
            }
        }

    }



    // 0(n^2) time complexity
    // O(1) space complexity.
    public static void rotateWithLayers(int[][] matrix){

        // left and right boundary
        int l = 0;
        int r = matrix.length - 1;

        while (l < r) // while left and right boundray does not cross.
        {
            for(int i = 0; i < r- l ; i++){
                int top = l; // top of the matrix.
                int bottom = r; // bottom of the matrix.

                // save the topleft.
                int topLeft = matrix[top][l + i];

                // move bottom left into top left
                matrix[top][l+i] = matrix[bottom - i][l];
                // move bottom right into bottom left
                matrix[bottom - i][l] = matrix[bottom][r-i];
                // move top right into bottom right
                matrix[bottom][r-i] = matrix[top + i][r];
                // move top left into top right
                matrix[top + i][r] = topLeft;
            }
            r -= 1;
            l += 1;
        }
    }
}
