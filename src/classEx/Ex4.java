package classEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {

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

		while (input != 6) {
			System.out.println(
					"1) Add new text\n2) Delete last text\n3) Delete first text\n4) Delete index\n5) print\n6) exit\nInput: ");
			input = scan.nextInt();
			if (input == 1) {
				System.out.println("Add new text");
				str.add(scan.next());
			} else if (input == 2 && str.size() > 0) {
				System.out.println("Remove last text");
				str.remove(str.size() - 1);
			} else if (input == 3 && str.size() > 0) {
				System.out.println("Remove first text");
				str.remove(0);
			} else if (input == 4 && str.size() > 0) {
				System.out.println("Remove at index: Max index = " + (str.size() - 1));
				str.remove(scan.nextInt());
			} else if (input == 5) {
				System.out.println("Printing the list");
				System.out.println("The list: " + str);
			}

		}
		System.out.println("Exited");
		scan.close();
	}

}
