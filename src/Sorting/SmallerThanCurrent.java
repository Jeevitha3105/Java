package Sorting;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countArr = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            int count=0;
            for(int j=0; j<nums.length;j++){

                if(nums[i]>nums[j]){

                    count++;
                }

            }
            countArr[i] = count;

        }
        return countArr;
    }
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}
