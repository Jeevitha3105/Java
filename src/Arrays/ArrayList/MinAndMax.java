package Arrays.ArrayList;
import java.util.*;
public class MinAndMax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = in.nextInt();
        in.nextLine();

        ArrayList<Integer> elements = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter element " + i + " : ");
            int element = in.nextInt();

            elements.add(element);
        }

        Collections.sort(elements);

        System.out.println("Maximum number:" + elements.get(elements.size()-1));
        System.out.println("Minimum number:" + elements.get(0));



    }
}
