package Arrays;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int result = 1;
        for(int i=0; i<nums.length; i++){
            result *= nums[i];
            answer[i] = result;
        }

        return answer;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
