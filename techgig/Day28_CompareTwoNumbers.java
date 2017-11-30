package techgig;

import java.util.Scanner;

public class Day28_CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number1 = scan.next();
		String number2 = scan.next();
		int sum1 = getSum(number1);
		int sum2 = getSum(number2);
		System.out.println((sum1 > sum2) ? number1 : number2);

	}

	private static int getSum(String number1) {
		int sum = 0;
		for (int i = 0; i < number1.length(); i++) {
			sum += Character.getNumericValue(number1.charAt(i));
		}
		return sum;
	}

}
