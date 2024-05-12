package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollNo;
    String name , address;

    public Student(int rollNo, String name, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.rollNo + " " + this.name + " "+ this.address;
    }

}
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {

    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {

        return a.rollNo - b.rollNo;
    }
}

class Sortbyname implements Comparator<Student> {

    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {

        return a.name.compareTo(b.name);
    }
}

public class Sort {
    public static void main(String[] args){
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student(111, "Mayank", "london"));
        arr.add(new Student(131, "Anshul", "nyc"));
        arr.add(new Student(121, "Solanki", "jaipur"));
        arr.add(new Student(101, "Aggarwal", "Hongkong"));

        System.out.println("Unsorted");
        for(int i=0 ;i < arr.size();i++){
            System.out.println(arr.get(i));
        }

        Collections.sort(arr, new Sortbyroll());

        System.out.println("\nSorted by roll no");
        for(int i=0 ;i < arr.size();i++){
            System.out.println(arr.get(i));
        }

        Collections.sort(arr, new Sortbyname());

        System.out.println("\nSorted by name");
        for(int i=0 ;i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
