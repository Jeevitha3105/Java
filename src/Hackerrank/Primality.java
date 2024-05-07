package Hackerrank;
import java.io.*;
import java.math.*;

public class Primality {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger bigInt = new BigInteger(n);

        System.out.println(bigInt.isProbablePrime(1) ? "prime" : "not prime");
    }
}
