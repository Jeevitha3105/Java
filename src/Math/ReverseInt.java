package Math;

public class ReverseInt {
    public static int reverse(int x) {
        int reversed = 0;
        while(x!=0){
            int lastDigit = x % 10;

            // If reversing the integer causes it to go out of this range (-2147483648 to 2147483647), you should return 0
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reversed = (reversed * 10) + lastDigit;
            x = x / 10;
        }
        return reversed;
    }

    public static void main(String[] args){
        System.out.println(reverse(1234568));
    }
}
