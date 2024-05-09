package Arrays.ArrayList;
import java.util.*;

public class JaggedArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sub-arrays: ");
        int n = in.nextInt();

        ArrayList<ArrayList<Integer>> jagged = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfArray = in.nextInt();
            ArrayList<Integer> subArray = new ArrayList<>();
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");

            for(int j=0; j<sizeOfArray;j++){
                subArray.add(in.nextInt());
            }
            jagged.add(subArray);
        }

        System.out.println("Jagged array is:");
        for(int i=0;i<jagged.size();i++){
            for(int j=0; j<jagged.get(i).size();j++){
                System.out.print(jagged.get(i).get(j) + " ");
            }
            System.out.println();
        }

        in.close();
    }
}

