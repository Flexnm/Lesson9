package classEx;

import java.util.Arrays;
import java.util.Scanner;

public class Thing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		int a1 = num;
		int i = 0;
		while (a1 > 0) {
			a1 = (int) (a1 / 10);
			i++;
		}

		int[] arr = new int[i];

		a1 = num;
		int a2 = 0;
		while (a1 != 0) { // make sure a 0 cant be at arr[0].
			int r = (int) (Math.random() * i);
			if (arr[r] == 0) {
				arr[r] = a1 % 10;
				a1 = (int) (a1 / 10);

			}

		}
		for (int j = 0; j < arr.length; j++) {
			a2 *= 10;
			a2 += arr[j];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(a2);

		int num2 = scan.nextInt();
		if (num2 == a2) {
			System.out.println("you did it");
		} else {
			System.out.println("too bad");
		}

		scan.close();

	}

}
