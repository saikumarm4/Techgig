package techgig;

import java.util.Scanner;

public class Day8_Armstrong {

	public static void main(String[] args) {
		int result = 0;
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int input = number;
		do {
			result += Math.pow(input % 10, 3);
			input /= 10;
		} while (input > 0);

		if (number == result)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
