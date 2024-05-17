package Hackerrank;
import java.util.*;
import java.security.*;
//sha-256 - A cryptographic hash can be used to make a signature for a text or a data file.
public class JavaSha_256 {

        public static void main(String[] args) throws Exception {
            Scanner in = new Scanner(System.in);
            byte[] hash = MessageDigest.getInstance("SHA-256").digest(in.nextLine().getBytes());
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        }

}
