package Arrays;

import java.util.Arrays;

public class HouseRobber {
    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length;i++){
            result[i] = Math.max(result[i-1] , result[i-2] + nums[i]);
            System.out.println(result[i]);
        }
        return result[nums.length-1];
    }
    public static void main(String[] args){
        int[] nums = {1,3,1};
        System.out.println(rob(nums));
    }
}
