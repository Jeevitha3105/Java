package Hackerrank;
import java.util.*;
public class JavaBitSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        BitSet bs1 = new BitSet(N);
        BitSet bs2 = new BitSet(N);

        for(int i=0; i<M;i++){
            String operation = sc.next();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            switch (operation){
                case "AND":
                    if(num1==1 && num2==2){
                        bs1.and(bs2);
                    }else if(num1==2 && num2==1){
                        bs2.and(bs1);
                    } else if (num1==1 && num2==1) {
                        bs1.and(bs1);
                    } else if (num1==2 && num2==2) {
                        bs2.and(bs2);
                    }
                    break;

                case "OR":
                    if(num1==1 && num2==2){
                        bs1.or(bs2);
                    }else if(num1==2 && num2==1){
                        bs2.or(bs1);
                    } else if (num1==1 && num2==1) {
                        bs1.or(bs1);
                    } else if (num1==2 && num2==2) {
                        bs2.or(bs2);
                    }
                    break;

                case "XOR":
                    if(num1==1 && num2==2){
                        bs1.xor(bs2);
                    }else if(num1==2 && num2==1){
                        bs2.xor(bs1);
                    } else if (num1==1 && num2==1) {
                        bs1.xor(bs1);
                    } else if (num1==2 && num2==2) {
                        bs2.xor(bs2);
                    }
                    break;

                case "FLIP":
                    if(num1==1){
                        bs1.flip(num2);
                    }else if(num1==2){
                        bs2.flip(num2);
                    }
                    break;

                case "SET":
                    if(num1==1){
                        bs1.set(num2);
                    }else if(num1==2){
                        bs2.set(num2);
                    }
                    break;
            }
            System.out.println(bs1.cardinality() + " "+ bs2.cardinality());
        }
    }
}
