package classEx;

import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		// Create a program with arraylist<String>.
		// add to it 2 string elements.
		// print them.
		// delete the first one.
		// add 2 more.
		// print
		// delete the last one.
		// print the first element and the last element in the list.
		// add a new string element in the middle.
		// print.

		ArrayList<String> str = new ArrayList<String>(); // Create a program with arraylist<String>.

		str.add("One"); // Add to it 2 string elements.
		str.add("Two");

		System.out.println("The current list: " + str); // Print them.

		str.remove(0); // Delete the first one.

		str.add("Three"); //Add 2 more.
		str.add("Four");

		System.out.println("The current list: " + str); // Print.

		str.remove(str.size() - 1); // Delete the last one.
		
		// Print the first element and the last element in the list.
		System.out.println("First element: " + str.get(0)); 
		System.out.println("Last element: " + str.get(str.size() - 1));

		str.add(str.size() / 2, "Five"); // Add a new string element in the middle.

		System.out.println("The current list: " + str); // Print.

	}

}
