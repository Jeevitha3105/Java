package strings;

public class ValidWord {
    public static boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        boolean vowelFound = false;
        boolean constantFound = false;
        boolean digitFound = false;

        for(int i=0; i<word.length(); i++){
            char ch = Character.toLowerCase(word.charAt(i));
            if(ch >='a' && ch <='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
                    vowelFound = true;
                }else{
                    constantFound = true;
                }
            }
            else if(ch >= '0' && ch <= '9'){
                digitFound = true;
            }else{
                return false;
            }


        }
        return vowelFound && constantFound;
    }
    public static void main(String[] args){
        System.out.println(isValid("aaaAb178"));
        System.out.println(isValid("a0"));
        System.out.println(isValid("234Adas"));
    }
}
