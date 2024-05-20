package strings;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        Set<Character> letters = new HashSet<>();
        for(char c : sentence.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
