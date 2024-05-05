
package Hackerrank;
import java.util.*;
public class StringTokens {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();

        String s = "He is a very very good boy, isn't he?";
        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
        }else{
            String[] words = s.split("[\\s!,?._'@]+");

            System.out.println(words.length);
            for(String word : words){
                System.out.println(word);
            }
        }

//        scan.close();
    }
}

