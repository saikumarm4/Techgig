package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class Day26_BiggestDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] numbers = scan.next().toCharArray();
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length - 1]);

	}

}
