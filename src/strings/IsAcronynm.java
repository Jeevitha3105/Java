package strings;
import java.util.Arrays;
import java.util.List;

//Check if a String Is an Acronym of Words

public class IsAcronynm {
    public static boolean isAcronym(List<String> words, String s) {
        String str="";
        for(String word : words){
            str+=word.charAt(0);
        }
        return str.equals(s);
    }
    public static void main(String[] args){
        List<String> words = Arrays.asList("alice","bob","charlie");

        String str = "abc";
        System.out.println(isAcronym(words,str));
    }

}
