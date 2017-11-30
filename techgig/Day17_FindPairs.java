package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class Day17_FindPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		scan.nextLine();
		int sum = scan.nextInt();
		Arrays.sort(array);

		int i = 0, j = size - 1;
		int tempResult = 0;

		while (i < j) {
			tempResult = array[i] + array[j];
			if (tempResult == sum) {
				System.out.println("True");
				return;
			} else if (tempResult < sum) {
				i++;
			} else {
				j--;
			}
		}
		System.out.println("False");
	}
}
