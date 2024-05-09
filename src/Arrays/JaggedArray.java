package Arrays;
import java.util.*;

public class JaggedArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sub-arrays: ");
        int n = in.nextInt();

        int[][] jagged = new int[n][];

        for(int i=0;i<n;i++){
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfArray = in.nextInt();
            jagged[i] = new int[sizeOfArray];
        }

        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
            for(int j=0;j<jagged[i].length;j++){
                jagged[i][j] = in.nextInt();
            }
        }

        System.out.println("Jagged array is:");
        for(int i=0;i<jagged.length;i++){
            for(int j=0; j<jagged[i].length;j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
