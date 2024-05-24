package Arrays;

import java.util.Arrays;

public class KthSmallest {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n * n];
        int index = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[index] = matrix[i][j];
                index++;
            }
        }
        Arrays.sort(arr);
        int kSmallest = arr[k-1];
        return kSmallest;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }
}
