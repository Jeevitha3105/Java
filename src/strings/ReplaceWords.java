package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWords {
    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split("\\s");

        for(int i=0; i<words.length; i++){
            for(String word : dictionary){
                if(words[i].startsWith(word)){
                    words[i] = word;
                }
            }
        }
        String replaced = String.join(" " , words);
        return replaced;
    }
    public static void main(String[] args){
        List<String> dictionary = new ArrayList<>(Arrays.asList("cat","bat","rat"));
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary,sentence));
    }
}
