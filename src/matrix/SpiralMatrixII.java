package matrix;

import java.util.Arrays;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {

        int[][] a = new int[n][n];
        int number = 1;

        int rowStart = 0;
        int rowEnd = n;
        int colStart = 0;
        int colEnd = n;

        while(rowStart < rowEnd && colStart < colEnd){
            //print top row (left to right)
            for(int i=colStart; i<colEnd; i++){
                a[rowStart][i] = number++;
            }
            rowStart+=1;

            //print right column (top to bottom)
            for(int i=rowStart; i<rowEnd; i++){
                a[i][colEnd-1] = number++;
            }
            colEnd-=1;

            //print bottom row (right to left)
            for(int i=colEnd-1; i>=colStart; i--){
                a[rowEnd-1][i] = number++;
            }
            rowEnd-=1;

            // print left column (bottom to top)
            for(int i=rowEnd-1; i>=rowStart; i--){
                a[i][colStart] = number++;
            }
            colStart+=1;

        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
}
