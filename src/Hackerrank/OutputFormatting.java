package Hackerrank;
import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String formatteds1 = String.format("%-15s" , s1);
            String formattedx1 = String.format("%03d", x);
            System.out.println(formatteds1 + formattedx1);
        }
        System.out.println("================================");

    }
}




