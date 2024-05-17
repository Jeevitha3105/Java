package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        //Sorting an array
        for(int i=0; i<nums.length-1;i++){
            for(int j=0; j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        //find the target
        for(int i=0; i<nums.length;i++){
            if(nums[i] == target){
                list.add(i);
            }
            else if(nums[i] > target){
                break;
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {1,2,4,2};
        int target = 2;
        System.out.println(targetIndices(nums,target));
    }
}
