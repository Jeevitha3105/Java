package strings;

public class Palindrome {
    public static boolean ValidPalindrome(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String cleanedString=str.toLowerCase();
        char[] strArray=cleanedString.toCharArray();

        int start=0;
        int end=strArray.length-1;
        while(start < end){
            if (strArray[start] != strArray[end]) {
                return false;
            }
            start++;
            end--;

        }

        return true;
    }
    public static void main(String[] args){
        System.out.println(ValidPalindrome("A man, a plan, a canal: Panama"));
    }
}
