package BinarySearch;

import java.util.Scanner;

public class Sqrt {
    public static int mySqrt(int x) {
        long num = 0;
        while((num * num) <= x){
            num++;
        }
        return (int)num-1;
    }
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
       System.out.println("Square root of " + x + " is : " + mySqrt(x));
    }
}
