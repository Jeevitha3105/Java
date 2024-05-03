package Hackerrank;
import java.util.*;


public class EndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count=1;


        for(int i=1; sc.hasNextLine(); i++){

            System.out.println(count + " " + sc.nextLine());

        }
        sc.close();
    }
}

