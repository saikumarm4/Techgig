package techgig;

import java.util.Scanner;

public class Day30_BiggerRow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int XN, XM;
		XN = scan.nextInt();
		XM = scan.nextInt();
		scan.nextLine();
		int sumOfRow = 0, max = 0, rowNumber = 0;
		for (int i = 0; i < XN; i++) {
			for (int j = 0; j < XM; j++) {
				sumOfRow += scan.nextInt();
			}
			if (max < sumOfRow) {
				max = sumOfRow;
				rowNumber = i + 1;
			}
			sumOfRow = 0;
		}

		System.out.println("Row " + rowNumber);
	}

}
