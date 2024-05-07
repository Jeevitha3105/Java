package Hackerrank;
import java.util.*;
import java.math.*;

public class BigInt {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger sum = bigA.add(bigB);
        BigInteger multiply = bigA.multiply(bigB);

        System.out.println(sum);
        System.out.println(multiply);
    }
}

