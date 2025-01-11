// A Java program to demonstrate working of list remove
// when Object to be removed is passed.
import java.util.*;

public class RemoveObject
{
	public static void main(String[] args)
	{
		// Demonstrating remove on ArrayList
		List<String> myAlist = new ArrayList<String>();
		myAlist.add("Geeks");
		myAlist.add("Practice");
		myAlist.add("Quiz");
		System.out.println("Original ArrayList : " + myAlist);
		myAlist.remove("Quiz");
		System.out.println("Modified ArrayList : " + myAlist);

		// Demonstrating remove on LinkedList
		List<String> myLlist = new LinkedList<String>();
		myLlist.add("Geeks");
		myLlist.add("Practice");
		myLlist.add("Quiz");
		System.out.println("Original LinkedList : " + myLlist);
		myLlist.remove("Quiz");
		System.out.println("Modified LinkedList : " + myLlist);
	}
}
