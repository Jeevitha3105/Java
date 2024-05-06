package Hackerrank;

import java.util.Scanner;

class ValidIpAddress{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    String pattern = "^([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)$";
}
