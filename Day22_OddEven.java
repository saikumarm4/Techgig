package techgig;

import java.util.Scanner;

public class Day22_OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		scan.nextLine();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}

		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0)
				evenSum += array[i];
			else
				oddSum += array[i];
		}

		System.out.println(Math.abs(evenSum - oddSum));
	}

}
