package techgig;

import java.util.Scanner;

public class Day25_Consecutive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		int previous = scan.nextInt();
		for (int i = 1; i < size; i++) {
			if (previous + i != scan.nextInt()) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
	}
}
