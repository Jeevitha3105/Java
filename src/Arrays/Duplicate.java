package Arrays;

import java.util.HashSet;


public class Duplicate {
    public static boolean containsDuplicate(int[] array){
        HashSet<Integer> set = new HashSet<>();

        for(int num : array){

            if(set.contains(num)){
                return true;
            }
            set.add(num);

        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,5,5,5,5,5,8};
        boolean result = containsDuplicate(arr);

        if(result){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
