package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class Day13_TransposeOfMatrix {

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

		for (int i = 0; i < XM; i++) {
			for (int j = 0; j < XN; j++) {
				System.out.print(X[j][i] + " ");
			}
			System.out.println();
		}
	}
}
