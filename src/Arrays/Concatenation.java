package Arrays;

public class Concatenation {
        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];
            for(int i=0;i<nums.length;i++){
                ans[i]=nums[i];
                ans[i+nums.length]=nums[i];
            }
            return ans;
        }
        public static void main(String[] args){
            Concatenation solution = new Concatenation();
            int[] nums = {1,2,1};
            int[] ans = solution.getConcatenation(nums);

            for(int num : ans){
                System.out.print(num);
            }
        }

}
