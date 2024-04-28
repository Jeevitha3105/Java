package strings;

public class Truncate {
    public static String truncateSentence(String s, int k) {
        String[] words = s.split("\\s+");
        String sentence = "";
        for(int i=0;i<k && i<words.length;i++){
            if(!words[i].isEmpty()){
                sentence+=words[i]+" ";
            }

        }
        return sentence.trim();
    }
    public static void main(String[] args){
        System.out.println(truncateSentence("Hello how are you Contestant",4));
    }
}
