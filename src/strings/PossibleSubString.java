package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PossibleSubString {
    public static ArrayList<String> subStrings(String str){
        ArrayList<String> sub = new ArrayList<>();
        for(int i=0; i<str.length();i++){
            for(int j=i+1; j<=str.length();j++){
                sub.add(str.substring(i,j));
            }
        }
        return sub;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        ArrayList<String> result = subStrings(str);
        Collections.sort(result);

        for(String s : result){
            System.out.print(s + " ");
        }
    }
}
