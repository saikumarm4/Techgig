package techgig;

import java.util.Scanner;

public class Day23_MaxMin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		scan.nextLine();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}

		sortArray(array);
		System.out.println(array[0] * array[size - 1]);
		System.out.println(mulOfMinMax(array));

	}

	public static void sortArray(int[] array) {
		int j = 0;
		int i = 1;
		int pivot = -1;
		for (; i < array.length; i++) {
			j = i - 1;
			pivot = array[i];
			while (j >= 0 && array[j] > pivot) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = pivot;
		}

	}

	public static int mulOfMinMax(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
			else if (array[i] > max)
				max = array[i];

		}
		return min * max;
	}
}
