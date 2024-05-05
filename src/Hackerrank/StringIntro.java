package Hackerrank;
import java.util.*;
public class StringIntro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
        String A = "Hello";
        String B = "Java";

        int sum = A.length() + B.length();
        System.out.println("Sum of length "+sum);

        String a = A.substring(0,1);
        String b = B.substring(0,1);

        if(A.compareTo(B)<0){
            System.out.println("No");
            System.out.println(a.toUpperCase()+A.substring(1,A.length()) + " " + b.toUpperCase() + B.substring(1,B.length()));
        }else{
            System.out.println("Yes");
            System.out.println(b.toUpperCase() + B.substring(1,B.length())+" "+a.toUpperCase()+A.substring(1,A.length()));
        }


    }
}
