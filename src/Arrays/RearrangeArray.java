package Arrays;
//Rearrange Array Elements by Sign

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        List<Integer> posArr = new ArrayList<>();
        List<Integer> negArr = new ArrayList<>();

        int[] resultantArr = new int[nums.length];

        for (int i=0; i<nums.length;i++){
            if(nums[i] > 0){
                posArr.add(nums[i]);
            }
            else{
                negArr.add(nums[i]);
            }
        }

        int i=0, j=0, k=0;
        while(i < posArr.size() && j < negArr.size()){
            resultantArr[k++] = posArr.get(i++);
            resultantArr[k++] = negArr.get(j++);
        }

        return resultantArr;
    }
    public static void main(String[] args){
        int[] nums = {3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
