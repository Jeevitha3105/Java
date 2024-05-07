package Arrays;

import java.util.HashMap;

public class NearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int prevIndex = map.get(nums[i]);
                if(Math.abs(prevIndex - i) <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,1};
        int k = 3;

        boolean result = containsNearbyDuplicate(array, k);

        if(result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
