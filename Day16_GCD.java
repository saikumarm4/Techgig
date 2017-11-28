package techgig;

import java.util.Scanner;

public class Day16_GCD {

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return 0;
		if (a == b)
			return a;

		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(gcd(a, b));

	}

}
