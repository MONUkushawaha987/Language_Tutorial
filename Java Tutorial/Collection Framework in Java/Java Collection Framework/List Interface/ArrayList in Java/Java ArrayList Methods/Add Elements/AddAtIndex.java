// Java Program to demonstrate
// Addition of elements at a specified index
import java.util.*;

public class AddAtIndex {
    public static void main(String[] args) {
      
        // Creating an empty ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        // Use add() method to 
        // add elements in the list
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println("" + al);

        // Adding new element 
        // at index 2
        int i = 2;
        al.add(i, 21);

        System.out.println("" + al);
    }
}