package Arrays;

import java.util.Arrays;

public class FstAndLastPosition {
    private static int firstPosition(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    private static int lastPosition(int[] nums, int target){
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int[] searchRange(int[] nums, int target) {
       int[] result = new int[2];
       result[0] = firstPosition(nums, target);
       result[1] = lastPosition(nums,target);
       return result;
    }

    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,8,10};
        int target = 8;
        int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
