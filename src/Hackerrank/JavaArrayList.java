package Hackerrank;
import java.util.*;

public class JavaArrayList {
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

        System.out.println("Enter the no of queries ");
        int queries = in.nextInt();
        for(int i=0; i<queries;i++){
            System.out.println("value 1 ");
            int x = in.nextInt();
            System.out.println("value 2 ");
            int y = in.nextInt();

            try{
                System.out.println(jagged.get(x-1).get(y-1));
            }
            catch (Exception e ){
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}

