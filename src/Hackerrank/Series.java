package Hackerrank;
import java.util.*;

public class Series {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            System.out.println();
            calc(a,b,n);
            System.out.println();
        }
        in.close();
    }

    public static void calc(int a, int b, int n) {
        int result = a;

        for(int i=0; i<n; i++) {
            result += (Math.pow(2,i)*b);
            System.out.print(result + " ");
        }
    }

}
