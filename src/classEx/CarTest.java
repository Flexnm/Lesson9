package classEx;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {

		ArrayList<Car> myCars = new ArrayList<Car>(); // This is an arrayList of type Car. All object in the list are of
														// type Car.

		myCars.add(new Car(101, "Lightning", "Blue")); // Adding Car Objects.
		myCars.add(new Car(102, "Thunder", "Red"));
		myCars.add(new Car(103, "Rain", "Green"));
		myCars.add(new Car(104, "Fog", "Black"));

		System.out.println(myCars); // Printing the list.

		Car x = myCars.get(2); // Creating x reference to the Car Object in the list of Cars. There is no need
								// for casting because the objects in the list have to be of type Car.

		System.out.println(x); // Printing x - results in printing a Car Object.

		myCars.remove(1); // It is possible to remove an Object from the list.

		System.out.println(myCars);

		myCars.remove(x); // It is also possible to remove an Object from the list by reference. Utulizes
							// the 'equals()' method. 'remove' scans the list from index 0 up to the first
							// Object that fulfills the condition of 'equals' and removes that Object.

		System.out.println(myCars);

		System.out.println(x); // The Car Object with the reference that was removed still exists in memory.

	}

}
