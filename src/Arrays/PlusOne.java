package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // Traverse the digits from the end
        for(int i=n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            // Set the current digit to 0 if it is 9
            digits[i] = 0;
        }

        // If all digits are 9, we need an additional digit at the beginning
        int[] number = new int[n+1];
        number[0] = 1;
        return number;
    }
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] digit = plusOne(digits);
        System.out.println(Arrays.toString(digit));
    }
}
