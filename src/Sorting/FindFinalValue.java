package Sorting;

public class FindFinalValue {
    public static int findFinalValue(int[] nums, int original) {
        int finalValue = original;
        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (num == finalValue) {
                    finalValue *= 2;
                    found = true;
                    break;
                }
            }
            if (!found) {
                break;
            }
        }
        return finalValue;

    }
    public static void main(String[] args){
        int[] nums = {8,19,4,2,15,3};
        int original = 8;
        System.out.println(findFinalValue(nums,original));
    }
}
