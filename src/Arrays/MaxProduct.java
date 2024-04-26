package Arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int firstMax=0;
        int secondMax=0;

        for(int num : nums){
            if(num>=firstMax){
                secondMax=firstMax;
                firstMax=num;
            }else if(num>secondMax && num!=firstMax){
                secondMax=num;
            }
        }

        return (firstMax-1) * (secondMax-1);
    }

    public static void main(String[] args){
        int[] nums={2,3,5,5,7,7};
        System.out.println(maxProduct(nums));

    }
}
