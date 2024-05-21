package Math;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;

        if(x < 0){
            return false;                   //negative numbers cannot be a palindrome
        }
        while (x!=0){
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x /= 10;
        }

        return original == reverse;

    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}
