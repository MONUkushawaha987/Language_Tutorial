// Java program to demonstrate 
// adding all elements at the end of ArrayList
import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
      
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(30);
        l2.add(40);

        // Adding all elements from 
        // l2 to l1
        l1.addAll(l2);

        System.out.println("Final ArrayList: " + l1);
    }
}