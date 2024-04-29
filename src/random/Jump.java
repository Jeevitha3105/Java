package random;

public class Jump {
    public static boolean canJump(int[] nums) {
        int max=0;
        int i=0;
        while(i<nums.length){
            max = Math.max(max,i+nums[i]);

            if(max>=nums.length-1){
                return true;
            }
            if(i==max){
                return false;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
