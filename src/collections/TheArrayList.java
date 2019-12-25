package collections;

import java.util.ArrayList; // Imports the Lists.

public class TheArrayList {
	public static void main(String[] args) {

		int[] nums = new int[4]; // Creating an array.
		// Manually entering values for elements.
		nums[0] = 10;
		nums[1] = 4;
		nums[2] = 120;
		nums[3] = -9;

		// Lists:
		ArrayList myList = new ArrayList(); // Creating a new list object. But it is empty.
		System.out.println(myList.size()); // .size() is similar to arrays .length
		// Important to notice that myList is a "generic" list object.
		myList.add(22);
		myList.add(34);
		myList.add(109);

		System.out.println(myList.size()); // Now size = 3. Lists size is dynamic, arrays size is static.
		System.out.println(myList); // Lists can be printed to console.

		System.out.println("index 1 = " + myList.get(1));

		myList.remove(1);
		System.out.println(myList); // Removing element from list changes the size - meaning that indexes of certain
									// elements also change.

		System.out.println("index 1 = " + myList.get(1));

		myList.set(1, 200); // Changes the value of the element in index.

		System.out.println(myList);
		System.out.println("index 1 = " + myList.get(1));

		myList.add("Myself");
		System.out.println(myList); // Lists can contain different object types.
		// Can also contain primitives and also Objects that are constructed in classes.

		myList.clear(); // Deletes all elements in the list.
		System.out.println("After clear: " + myList);

		// When creating an arraylist, it can be defined to contain a specific type:
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("This");
		// strings.add(4); // Gives an error because int is not a String object.
		strings.add("More");
		// All actions on the list must be specific to the contained objects.
		// In <> only Classes can be placed (not primitives like 'int', 'char' etc.
		// instead 'Integer', 'Character' etc. will work).
		System.out.println(strings);
		
		// 'add' always adds an element at the end.
		// 'add(index, 'value') will add element at index, will push the rest +1 index.
		// Can add an element this way from 0 up to 'size' index but other than that will cause a crash.
		
		strings.add(1, "Other");
		System.out.println(strings);
		strings.add(3, "Last");
		System.out.println(strings);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("MyName");
		names.add("HisName");
		names.add("HerName");
		
		strings.addAll(names);  // Adds the whole list to the destination.
		System.out.println(strings);
		
		
		
	}

}
