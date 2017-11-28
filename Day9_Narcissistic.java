package techgig;

import java.util.Scanner;

public class Day9_Narcissistic {

	public static void main(String[] args) {
		int length = 0;
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int input = number;
		do {
			input /= 10;
			length++;
		} while (input > 0);

		input = number;
		int result = 0;
		do {
			result += Math.pow(input % 10, length);
			input /= 10;
		} while (input > 0);

		if (number == result)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
