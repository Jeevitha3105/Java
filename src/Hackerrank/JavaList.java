package Hackerrank;
import java.util.*;
public class JavaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }

        System.out.println("No of queries:");
        int query = in.nextInt();
        for(int i=0;i<query;i++){
            System.out.println("Enter Insert or Delete");
            String op = in.next();

            if(Objects.equals(op,"Insert")){
                int index = in.nextInt();
                int val = in.nextInt();
                list.add(index,val);
            }else if(Objects.equals(op,"Delete")){
                int num = in.nextInt();
                list.remove(num);
            }
        }


        System.out.println("Updated list :");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
