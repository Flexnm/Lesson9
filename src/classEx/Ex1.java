package classEx;

import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {

		int[] intArr = new int[5];
		double avg = 0;
		int counter = 0;

		int index = 0; // Index of the element checked.
		int five = 0; // Number of elements that are larger than 5.
		int max = 0; // The maximum value in the array.
		int min = 10; // The minimum value in the array. Set to the largest possible value to be put
						// in the array.

		while (index < intArr.length) {
			int x = (int) (Math.random() * 10 + 1); // randomize a number within range.
			int i;
			for (i = 0; i < intArr.length; i++) {
				if (intArr[i] == x) { // if there is a dupliacete, dont add it to the array.
					counter++;
					break;
				}
			}

			if (i == intArr.length) { // if its not a duplicate (if we didnt break):
				intArr[index] = x; // add it to the array.
				index++; // prepare to check the next element in the array.
				avg += x; // add the number to the sum of all elements of the array.
				if (x > 5) { // check if it is larger than 5.
					five++; // if it is count it as a number that is larger than 5.
				}
				for (int j = 0; j < intArr.length; j++) { // checking max and min.
					if (x > max) { // if that number is larger than max:
						max = x; // make it max.
					} else if (x < min) { // if the number is smaller than min:
						min = x; // make it min.
					}
				}
			}
		} // print everything.
		System.out.println(counter);
		System.out.println(Arrays.toString(intArr));
		System.out.println("max: " + max);
		System.out.println("mix: " + min);
		System.out.println(avg / (double) intArr.length);
		System.out.println(five);

	}

}
