package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeWords {
    public static String arrangeWords(String text) {
        text = text.toLowerCase();
        String[] words = text.split("\\s");

        Arrays.sort(words, Comparator.comparingInt(String::length));
        if(words.length>0 && words[0].length()>0){
            words[0] = words[0].substring(0,1).toUpperCase()+words[0].substring(1);
        }

        String result = String.join(" ",words);
        return result;
    }
    public static void main(String[] args){
        System.out.println(arrangeWords("Keep calm and code on"));
    }
}
