package Hackerrank;
import java.util.*;

class Students implements Comparable<Students> {
    private int id;
    private String name;
    private double cgpa;

    public Students(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Students other) {
        if (this.cgpa != other.cgpa) {
            return Double.compare(other.cgpa, this.cgpa); // Higher CGPA comes first
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name); // Ascending order of name
        } else {
            return Integer.compare(this.id, other.id); // Ascending order of id if CGPA and name are same
        }
    }
}

class Priorities {
    public List<Students> getStudents(List<String> events) {
        PriorityQueue<Students> pq = new PriorityQueue<>();

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Students(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll(); // Remove the highest priority student
            }
        }

        List<Students> result = new ArrayList<>(pq);
        Collections.sort(result); // Sort the remaining students based on priority criteria
        return result;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Students> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Students st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
