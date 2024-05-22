package Sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return nums1;
        }
        if(m == 0){
            return nums2;
        }

        for(int i=0; i<nums2.length;i++){
            for(int j=0; j<nums1.length; j++){
                if(nums1[j] == 0){
                    nums1[j] = nums2[i];
                }
            }
        }
        return nums1;
    }
    public static void main(String[] args){
      int[] nums1 = {1,2,3,0,0,0};
      int[] nums2 = {4,5,6};
        System.out.println(Arrays.toString(merge(nums1, 3, nums2, 3)));
    }
}
