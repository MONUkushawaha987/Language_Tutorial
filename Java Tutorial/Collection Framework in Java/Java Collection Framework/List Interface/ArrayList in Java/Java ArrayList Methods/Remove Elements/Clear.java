// Java program to demonstrate clear() method
// in Integer ArrayList
import java.util.ArrayList;

public class Clear {
    public static void main(String[] args) {

        // Creating an ArrayList of integers
        ArrayList<Integer> n = new ArrayList<>();

        // Adding elements to the ArrayList
        n.add(10);
        n.add(20);
        n.add(30);

        // Printing the original ArrayList
        System.out.println("" + n);

        // Clearing all elements from the ArrayList
        n.clear();

        System.out.println("" + n);
    }
}