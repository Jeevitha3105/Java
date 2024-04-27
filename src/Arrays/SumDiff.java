package Arrays;

public class SumDiff {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int totalSum=0;
        for(int num : nums){
            totalSum+=num;
        }
        int rightSum=totalSum;
        int leftSum=0;

        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            result[i]=Math.abs(rightSum-leftSum);
            leftSum+=nums[i];

        }
        return result;
    }

    public static void main(String[] args){
        SumDiff difference = new SumDiff();
        int[] nums = {10,4,8,3};
        int[] diff = difference.leftRightDifference(nums);

        for(int num : diff){
            System.out.println(num + " ");
        }
    }
}
