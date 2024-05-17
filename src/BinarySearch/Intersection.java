package BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {

        //to remove duplicates
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }

        //intersection
        Set<Integer> intersection = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];

        int index = 0;
        for(int num : intersection){
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums1= {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

}
