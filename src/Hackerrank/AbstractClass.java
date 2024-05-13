package Hackerrank;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    void setTitle(String s){
        this.title=s;
    }
    String getTitle(){
        return title;
    }
}
public class AbstractClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        MyBook new_title = new MyBook();
        new_title.setTitle(title);
        System.out.println("The book title is : " + new_title.getTitle());
        scan.close();
    }
}
