package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class Day14_LexicographicallySort {

	public static void main(String[] args) {
		/*
		 * String[] arrayOfWords = { "fortran", "java", "perl", "python", "php",
		 * "javascript", "c", "cpp", "ruby", "csharp" };
		 */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		String[] arrayOfWords = new String[size];
		for (int i = 0; i < size; i++) {
			arrayOfWords[i] = scan.next();
		}
		
		for (int i = 1; i < arrayOfWords.length; i++) {
			int j = i - 1;
			String pivot = arrayOfWords[i];
			while (j >= 0 && pivot.compareTo(arrayOfWords[j]) < 0) {
				arrayOfWords[j + 1] = arrayOfWords[j];
				j--;
			}
			arrayOfWords[j + 1] = pivot;
		}

		// System.out.println(Arrays.toString(arrayOfWords));

		for (int i = 0; i < arrayOfWords.length; i++) {
			System.out.println(arrayOfWords[i]);
		}
	}

}
