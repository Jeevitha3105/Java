package Arrays;

import java.util.Arrays;

public class RightRotate {
    public static int[] rotate(int[]arr,int n){
        int[] temp=new int[arr.length];

        for(int i = arr.length - n, j = 0; i < arr.length; i++, j++){
            temp[j]=arr[i];
        }
        for(int i=0;i<arr.length-n;i++){
            temp[i+n]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] result = rotate(nums,2);

        System.out.println(Arrays.toString(result));
    }
}
