// Java program to demonstrate the use of removeIf()
// method with ArrayList of Strings
import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {

        // Creating an ArrayList of student names
        ArrayList<String> s = new ArrayList<>();

        // Adding student names to the ArrayList
        s.add("Sweta");
        s.add("Gudly");
        s.add("Sohan");
        s.add("Amiya");
        s.add("Ram");

        // Using removeIf() method to 
        // remove names starting with 'S'
        s.removeIf(name -> name.startsWith("S"));

        System.out.println("Students whose names do not start with S:");
        System.out.println(s);
    }
}