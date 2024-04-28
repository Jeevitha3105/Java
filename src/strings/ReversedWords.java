package strings;

public class ReversedWords {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder str = new StringBuilder();

        for(int i=word.length-1;i>=0;i--){
            if(!word[i].isEmpty()){
                str.append(word[i] + " ");
            }
        }
        return str.toString().trim();
    }

    public static void main(String[] args){
        ReversedWords obj = new ReversedWords();
        String reversed = obj.reverseWords("The sky is blue");

        System.out.println(reversed);
    }
}
