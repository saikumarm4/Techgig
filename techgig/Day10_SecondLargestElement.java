package techgig;

import java.util.Scanner;

public class Day10_SecondLargestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		scan.nextLine();
		int[] array = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			array[i] = scan.nextInt();
		}
		sortArray(array);
		System.out.println(array[numberOfElements - 2]);
	}

	public static void sortArray(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			int pivot = array[i];
			while (j >= 0 && array[j] > pivot) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = pivot;
		}

	}
}
