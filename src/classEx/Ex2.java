package classEx;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		// Let the computer get a random char from the array.
		// The user needs to guess it.

		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };

		Scanner scan = new Scanner(System.in);

		char toGuess = chars[(int) (Math.random() * chars.length)];
	//	char toGuess = (char) (int) (Math.random() * 6 + 97); <--- Same as above but as conversion from ASCII.
	//	Randomizes an ASCII index of a char and then cast it as char. Does not require an array.
		System.out.println("Enter your guess: (a, b, c, d, e, f)");
		for (int i = 0; i < 3; i++) {
			char userGuess = scan.next().charAt(0);
			if (toGuess == userGuess) {
				System.out.println("You did it!");
				break;
			} else {
				System.out.println("Nah...");
			}
		}

		scan.close();

	}

}
