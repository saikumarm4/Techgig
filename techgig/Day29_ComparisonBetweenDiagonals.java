package techgig;

import java.util.Scanner;

public class Day29_ComparisonBetweenDiagonals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int XN, XM;
		XN = scan.nextInt();
		XM = scan.nextInt();
		scan.nextLine();
		int[][] X = new int[XN][XM];
		for (int i = 0; i < XN; i++) {
			for (int j = 0; j < XM; j++) {
				X[i][j] = scan.nextInt();
			}
		}

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < XN; i++) {
			//System.out.println(X[i][i] + " " + X[i][XN - 1 - i]);
			sum1 += X[i][i];
			sum2 += X[i][XN - 1 - i];
		}
		if (sum1 == sum2)
			System.out.println("Equal");
		else if (sum1 > sum2)
			System.out.println("Diagonal 1");
		else
			System.out.println("Diagonal 2");
	}

}
