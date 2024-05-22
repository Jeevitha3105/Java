package Math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
//     Arrays.sort(nums);
//     System.out.println(Arrays.toString(nums));

     int[] result = new int[nums.length+1];
     for (int i=0; i<result.length;i++){
         result[i] = i;
     }
     Set<Integer> set = new HashSet<>();
     for(int num : nums){
         set.add(num);
     }
     int missing = 0;
     for(int j=0; j<result.length;j++){
         if(!set.contains(result[j])){
             missing = result[j];
         }
     }
     return missing;
    }

    public static void main(String[] args){
        int[] nums = {1,0};
        System.out.println(missingNumber(nums));

    }
}
