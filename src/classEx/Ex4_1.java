package classEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_1 {
	// With switch.
	// Show an user interface
	// 1) Add new text
	// 2) Delete last text
	// 3) Delete first text
	// 4) print
	// 5) exit

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		int input = 0;

		do {
			System.out.println(
					"1) Add new text\n2) Delete last text\n3) Delete first text\n4) Delete index\n5) print\n6) exit\nInput: ");
			input = scan.nextInt();
			switch (input) {

			case 1:
				System.out.println("Add new text");
				str.add(scan.next());
				break;

			case 2:
				if (str.size() > 0) {
					System.out.println("Remove last text");
					str.remove(str.size() - 1);
				}
				break;

			case 3:
				if (str.size() > 0) {
					System.out.println("Remove first text");
					str.remove(0);
				}
				break;

			case 4:
				if (str.size() > 0) {
					System.out.println("Remove at index: Max index = " + (str.size() - 1));
					int remove = scan.nextInt();
					if (remove >= 0 && remove < str.size()) {
						str.remove(remove);
					} else {
						System.out.println("Invalid index!");
					}
				}
				break;

			case 5:
				System.out.println("Printing the list");
				System.out.println("The list: " + str);
				break;

			case 6:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}
		} while (input != 6);

		System.out.println("Exited");
		scan.close();
	}
}
