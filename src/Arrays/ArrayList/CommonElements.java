package Arrays.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
   public static void main(String[] args){
       ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
       ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(10,90,70,40,50));
       ArrayList<Integer> common = new ArrayList<>();

       for(int i=0; i<arr1.size();i++){
           for(int j=0; j< arr2.size();j++){
               if(arr1.get(i).equals(arr2.get(j))){
                   common.add(arr1.get(i));
               }
           }
       }

       for(int element : common){
           System.out.println(element);
       }
   }
}
