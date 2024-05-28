package Arrays;
//26. Remove Duplicates from Sorted Array
public class RemoveDuplicates {

    //Two pointers approach
        public static int removeDuplicates(int[] nums) {
            if(nums.length == 0){
                return 0;
            }

            int unique = 1;                                     //count no. of unique elements
            for(int current=1; current < nums.length; current++){
                if(nums[current] != nums[current-1]){             // Compare the current element with the previous element
                    nums[unique] = nums[current];                 // If they are different, assign the current element to unique pointer's position
                    unique++;
                }

            }
            return unique;
        }

        public static void main(String[] args){
            int[] nums = {1,1,2,2,3,3,4,4,5,5};
            System.out.println(removeDuplicates(nums));
        }
}
