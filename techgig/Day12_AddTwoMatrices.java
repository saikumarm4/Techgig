package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class Day12_AddTwoMatrices {

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
			scan.nextLine();
		}

		int YN, YM;
		YN = scan.nextInt();
		YM = scan.nextInt();
		scan.nextLine();
		int[][] Y = new int[YN][YM];
		for (int i = 0; i < YN; i++) {
			for (int j = 0; j < YM; j++) {
				Y[i][j] = scan.nextInt();
			}
			scan.nextLine();
		}

		int[][] Z = new int[YN][YM];
		for (int i = 0; i < YN; i++) {
			for (int j = 0; j < YM; j++) {
				Z[i][j] = X[i][j] + Y[i][j];
				System.out.print(Z[i][j] + " ");
			}
			System.out.println();
		}

	}

}
