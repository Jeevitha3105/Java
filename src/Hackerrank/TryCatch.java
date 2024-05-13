package Hackerrank;
import java.util.*;

public class TryCatch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        finally{
            scan.close();
        }
    }
}
