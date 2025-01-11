// Java program to demonstrate removeRange() method 
// with ArrayList of Integers
import java.util.ArrayList;

// custom subclass to access removeRange()
class Custom extends ArrayList<Integer> {
  
    // Method to remove elements 
    // from specified range
    public void removeRangeList(int s, int e) {
        removeRange(s, e);
    }
}

public class RemoveRange {
    public static void main(String[] args) {
      
        // Creating an ArrayList
        Custom n = new Custom();
      
        // Adding elements to 
        // the ArrayList
        n.add(5);
        n.add(7);
        n.add(11);
        n.add(13);
        n.add(17);

        // Printing original list
        System.out.println("" + n);

        // Removing elements from index 1 to 4
        n.removeRangeList(1, 4);

        System.out.println("" + n);
    }
}