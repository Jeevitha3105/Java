package Hackerrank;
import java.util.*;
import java.security.*;
//MD5 (Message Digest Algorithm 5) is a widely used cryptographic hash function that produces a 128-bit (16-byte) hash value.

public class JavaMD5 {
        public static void main(String[] args) throws Exception {
            Scanner in = new Scanner(System.in);
            byte[] hash = MessageDigest.getInstance("MD5").digest(in.nextLine().getBytes());
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        }
}
