package Hackerrank;
import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student other) {
        // Compare students by CGPA in descending order
        if (this.cgpa != other.cgpa) {
            return Double.compare(other.cgpa, this.cgpa);
        }
        // If CGPA is equal, compare by first name alphabetically
        int nameComparison = this.fname.compareTo(other.fname);
        if (nameComparison != 0) {
            return nameComparison;
        }
        // If first names are also equal, compare by ID
        return Integer.compare(this.id, other.id);
    }
}

//Complete the code

public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



