package strings;

public class Anagram {
    public static boolean isAnagram(String s, String t){
        char[] str1 = sorting(s);
        char[] str2 = sorting(t);
        String s1 = new String(str1);
        String s2 = new String(str2);

        if(s1.length()!= s2.length()){
            return false;
        }else{
            return s1.equals(s2);
        }

    }
    public static char[] sorting(String s){
        char[] charArr= s.toCharArray();
        for(int i=0;i< charArr.length-1;i++){
            for(int j=0;j<charArr.length-i-1;j++){
                if(charArr[j]>charArr[j+1]){
                    char temp = charArr[j];
                    charArr[j]=charArr[j+1];
                    charArr[j+1]=temp;
                }
            }
        }

        return charArr;
    }
    public static void main(String[] args){
        boolean result = isAnagram("racecar","cartace");
        System.out.println(result);
    }
}
