package techgig;

import java.util.Scanner;

public class Day24_PlayWithAvg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		int sumEven = 0, countEven = 0;
		int sumOdd = 0, countOdd = 0;
		int tempHolder = -1;
		int result = 0;
		for (int i = 0; i < size; i++) {
			tempHolder = scan.nextInt();
			if (tempHolder % 2 == 0) {
				sumEven += tempHolder;
				countEven++;
			} else {
				sumOdd += tempHolder;
				countOdd++;
			}
		}

		result = countOdd > 0 ? Math.round(sumOdd * 1.0f / countOdd) : 0;
		result += countEven > 0 ? Math.round(sumEven * 1.0f / countEven) : 0;
		System.out.println(result);

	}
}
