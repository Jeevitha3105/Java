package Sorting;

import java.util.Arrays;

public class SortByKthScore {
    public static int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (row1,row2) -> Integer.compare(row2[k],row1[k]));
        return score;
    }
    public static void main(String[] args){
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;
        System.out.println(Arrays.deepToString(sortTheStudents(score, k)));
    }
}
