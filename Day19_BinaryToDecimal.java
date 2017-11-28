package techgig;

import java.util.Scanner;

public class Day19_BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String binary = scan.next();
		int result = 0;
		int i = 0;
		int size = binary.length();
		while (i < size) {
			if (binary.charAt(i) == '1')
				result += Math.pow(2, size - 1 - i);
			i++;
		}
		System.out.println(result);

	}

}
