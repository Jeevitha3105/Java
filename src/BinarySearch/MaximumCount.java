package BinarySearch;

public class MaximumCount {
    public static int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] < 0){
                negCount++;
            }else if(nums[i] > 0){
                posCount++;
            }
        }
        return posCount > negCount ? posCount : negCount;
    }
    public static void main(String[] args){
        int[] nums = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));
    }
}
