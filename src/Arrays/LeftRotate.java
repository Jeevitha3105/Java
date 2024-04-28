package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static int[] left(int[]arr, int n){
        int[] temp = new int[arr.length];

        for(int i=n;i<arr.length;i++){
            temp[i-n]=arr[i];
        }
        for(int i=0;i<n;i++){
            temp[arr.length-n+i] = arr[i];
        }
        return temp;

    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] result = left(nums,2);
        System.out.println(Arrays.toString(result));
    }
}

