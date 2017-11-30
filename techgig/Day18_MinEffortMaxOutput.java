package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class Day18_MinEffortMaxOutput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scan.nextInt();

		int[] arrayDuplicate = array.clone();
		Arrays.sort(arrayDuplicate);

		int first = -1, last = -1;
		for (int i = 0; i < size; i++) {
			if (array[i] != arrayDuplicate[i]) {
				if (first == -1)
					first = i;
				else
					last = i;
			}
		}
		for (int i = first; i <= last; i++) {
			System.out.print(array[i] + " ");
		}
		scan.close();
	}
}
