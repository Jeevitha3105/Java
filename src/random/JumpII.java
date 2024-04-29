package random;

public class JumpII {
    public static int jump(int[] nums) {
        int max =0;
        int count=0;
        int tempMax=0;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max, i+nums[i]);

            if(max>=nums.length-1){
                count++;
                break;
            }
            if(tempMax==i){
                count++;
                tempMax=max;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
