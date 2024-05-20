package Sorting;

import java.util.Arrays;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i<heights.length-1; i++){
            for(int j=0; j<heights.length-1-i;j++){
                if(heights[j] < heights[j+1]){
                    int temp = heights[j];
                    String str = names[j];
                    heights[j] = heights[j+1];
                    names[j] = names[j+1];
                    heights[j+1] = temp;
                    names[j+1] = str;
                }
            }

        }
        return names;
    }
    public static void main(String[] args){
        String[] names = {"Mary","John","Emma"};
        int[] heights = {100,65,170};
        String[] results = sortPeople(names,heights);
        System.out.println(Arrays.toString(results));
    }
}
