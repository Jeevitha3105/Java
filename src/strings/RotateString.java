package strings;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);
    }
    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "cdeab";
        System.out.println(rotateString(str1,str2));
    }
}
