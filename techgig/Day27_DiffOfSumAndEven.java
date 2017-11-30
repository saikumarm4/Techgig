package techgig;

import java.util.Scanner;

public class Day27_DiffOfSumAndEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		int sum = 0;
		int temp = -1;
		for (int i = 0; i < input.length(); i++) {
			temp = Character.getNumericValue(input.charAt(i));
			if (temp % 2 == 0)
				sum += temp;
			else
				sum -= temp;
		}
		System.out.println(Math.abs(sum));

	}

}
