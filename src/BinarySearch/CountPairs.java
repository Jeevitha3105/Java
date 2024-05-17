package BinarySearch;

import java.util.Arrays;
import java.util.List;

//Count Pairs Whose Sum is Less than Target

public class CountPairs {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                int sum = nums.get(i) + nums.get(j);
                if(sum < target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Integer numbers[] = new Integer[] { -1,1,2,3,1 };
        List<Integer> list = Arrays.asList(numbers);
        int target = 2;

        System.out.println(countPairs(list, target));
    }
}
