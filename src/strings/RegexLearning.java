package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* [abc] ---------- either a or b or c
* [^ab]------------ except a and b
* [a-zA-Z]--------- all alphabetics both lower and upper case
* [a-zA-Z0-9] ----- alphabetics and numbers
* [^a-zA-Z0-9] ---- except alphanumeric , all the special characters
* \d -------------- Matches any digit character. Equivalent to the character range [0-9].
* \D -------------- Matches any non-digit character. Equivalent to the character range [^0-9].
* \s -------------- Matches any whitespace character, including space, tab, newline, etc.
* \S -------------- Matches any non-whitespace character.
* \w -------------- Matches any word character. Equivalent to the character range [a-zA-Z0-9_].
* \W -------------- Matches any non-word character.
* . --------------- Matches any character except newline (\n).
* \b -------------- Matches a word boundary. It does not consume any characters but asserts that a word boundary exists at a certain position.
* \B -------------- Matches a non-word boundary.
* \G -------------- Matches the end of the previous match
* + --------------- At least one match
* "*" ------------- any number of match
* "?" ------------- atmost one match
* {number} -------- number of occurances
* {number1 , number2}
*
* */

public class RegexLearning {
    public static void basic(String sentence){

//      Pattern p = Pattern.compile("S|a");
        Pattern p = Pattern.compile("sea");
        Matcher matches = p.matcher(sentence);

        int count = 0;
        while(matches.find()){                                                          //find() - checks if it is there or not
            count++;
            System.out.println(matches.group() + " starts at " + matches.start() + " ends at " + matches.end());  //group() - to print previous match
                                                                                                                  // start() , end() - starting and ending index
        }
        System.out.println("Count is : " + count);
    }

    public static void classes(String sentence){

        Pattern p = Pattern.compile("[a-zA-Z0-9]");                          //all alphabetics and numbers
        Matcher matches = p.matcher(sentence);
        while(matches.find()){
            System.out.print(matches.group() + " ");
        }
    }

    //Predefined classes or meta class

    public static void predefinedClass(String sentence){
        Pattern p = Pattern.compile("\\bTamil");                      // \\s,\\S,\\d,\\D,\\w,\\W,\\b,\\B,\\G,.
        Matcher matcher = p.matcher(sentence);
        while(matcher.find()){
            System.out.println(matcher.group() + " Starts at " + matcher.start());
        }
    }

    //Quantifiers
    public static void quantifiers(String sentence){
        Pattern p = Pattern.compile("a+");                            // "+" atleast one
        Matcher matcher = p.matcher(sentence);
        while(matcher.find()){
            System.out.println(matcher.group() + " Starts at " + matcher.start());
        }
    }

    //split()
    public static void splitMethod(){
        String str1 = "Java is a high level programming language";
        String str2 = "www.google.com";

        //split() in string

        String[] str = str1.split("\\s");                                      //argument - regex
        for(String s : str){
            System.out.println(s);
        }
        String[] st = str2.split("\\.");
        for(String s : st){
            System.out.println(s);
        }

        //split() in regex
        Pattern p = Pattern.compile("\\s");
        String[] s1 = p.split(str1);                                       //argument - string
        for(String s : s1){
            System.out.print(s + " " );
        }
        System.out.println();

        Pattern pattern = Pattern.compile("\\.");
        String[] s2 = pattern.split(str2);
        for(String s : s2){
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args){
        String sentence = "Sally sells seashells by the seashore";
        basic(sentence);

        System.out.println();

        String regex = "Abbcbbcacba123456";
        classes(regex);

        System.out.println();

        String regexSentence = "TamilTamil Tamilnadu 641021";
        predefinedClass(regexSentence);

        System.out.println();

        String s = "abbacabaabcbcacab";
        quantifiers(s);

        System.out.println();
        splitMethod();

    }
}
