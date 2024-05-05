package Hackerrank;
import java.util.*;
public class StaticInitialization {

        static int H;
        static int B;
        static boolean flag=true;

        static{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the value for H: ");
            H = scan.nextInt();
            System.out.print("Enter the value for B: ");
            B = scan.nextInt();

            if(B<=0 || H<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag=false;
            }
        }


        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }//end of class



