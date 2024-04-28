package strings;

public class ReversePrefix {
    public static String reversePrefix(String word, char ch) {
        int index = -1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }

        if (index == -1)
            return word;

        char[] reversed = word.toCharArray();

        int start = 0;
        int end = index;

        while(start<end){
            char temp = reversed[start];
            reversed[start]=reversed[end];
            reversed[end]=temp;
            start++;
            end--;
        }
        return new String(reversed);
    }
    public static void main(String[] args){
        String result = reversePrefix("xbvgnm",'g');
        System.out.println(result);
    }
}
