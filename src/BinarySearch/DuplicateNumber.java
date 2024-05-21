package BinarySearch;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){            //checks, the number already in set
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,3,4};
        System.out.println(findDuplicate(nums));
    }
}
