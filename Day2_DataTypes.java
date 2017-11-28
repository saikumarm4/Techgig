package techgig;

import java.util.Scanner;

public class Day2_DataTypes {

	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if (isParsableAsInteger(input)) {
			System.out.println("This is of type Integer");
		} else if (isParsableAsFloat(input)) {
			System.out.println("This is of type Float");
		} else if (isParsableAsString(input)) {
			System.out.println("This is of type String");
		} else {
			System.out.println("This is something else");
		}

	}

	public static boolean isParsableAsInteger(String input) {
		try {
			Integer x = Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isParsableAsFloat(String input) {
		try {
			Float x = Float.parseFloat(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isParsableAsString(String input) {
		if (input instanceof String) {
			return true;
		}
		return false;
	}

}
