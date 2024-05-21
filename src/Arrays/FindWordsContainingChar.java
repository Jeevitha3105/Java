package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWordsContainingChar {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length();j++){
                if(words[i].charAt(j) == x){
                    set.add(i);
                }
            }
        }
        list.addAll(set);
        return list;
    }
    public static void main(String[] args){
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words,x));
    }
}
