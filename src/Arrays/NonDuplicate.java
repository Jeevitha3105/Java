package Arrays;

import java.util.*;

public class NonDuplicate {
    public static int singleNonDuplicate(int[] nums) {
        int nonDuplicate = 0;
        Map<Integer,Integer> singleNumber = new HashMap<>();
        for(int num : nums){
            singleNumber.put(num, singleNumber.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : singleNumber.entrySet()) {
            if(entry.getValue()==1){
                nonDuplicate=entry.getKey();
            }
        }

        return nonDuplicate;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4,4,5,5};
        int result = singleNonDuplicate(nums);
        System.out.println(result);
    }
}
