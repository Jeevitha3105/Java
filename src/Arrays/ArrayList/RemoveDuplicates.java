package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args){
       Integer[] a = new Integer[] {3, 7, 2, 3, 8, 2, 5, 7};
       List<Integer> list = Arrays.asList(a);
       ArrayList<Integer> newList = new ArrayList<>();

       //remove duplicates
        for(int element : list){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }

        // Display
        System.out.println("Original array : ");
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println("\nResult array : ");
       for(int i : newList){
           System.out.print(i + " ");
       }

    }

}
