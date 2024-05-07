package Hackerrank;
import java.math.BigDecimal;
import java.util.Arrays;

public class BigDecimalNum {
    public static void main(String[] args) {
        // Default input values
        int n = 5;
        String[] s = {"10.5", "5.3", "7.8", "3.2", "9.1"};

        // Convert strings to BigDecimal
        BigDecimal[] int_arr = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            int_arr[i] = new BigDecimal(s[i]);
        }

        // Sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (int_arr[j].compareTo(int_arr[j + 1]) == -1) {
                    // Swap BigDecimal values
                    BigDecimal temp = int_arr[j];
                    int_arr[j] = int_arr[j + 1];
                    int_arr[j + 1] = temp;

                    // Swap corresponding strings
                    String temp_str = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp_str;
                }
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
