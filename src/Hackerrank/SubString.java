package Hackerrank;
import java.util.*;

// to find the smallest and largest lexicographically

public class SubString {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        String sub = "";
        for(int i=0; i<=s.length()-k;i++){
            sub = s.substring(i,i+k);
            if(smallest.compareTo(sub)>=0){
                smallest =  sub;
            }
            if(largest.compareTo(sub)<=0){
                largest = sub;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
