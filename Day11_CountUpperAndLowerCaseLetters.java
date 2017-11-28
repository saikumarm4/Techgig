package techgig;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day11_CountUpperAndLowerCaseLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int lowerCase = 0;
		int upperCase = 0;
		for (int i = 0; i < input.length(); i++) {
			int character = input.charAt(i);
			if (character >= 97 && character <= 122) {
				lowerCase += 1;
			} else if (character >= 65 && character <= 90) {
				upperCase += 1;
			}
		}
		System.out.println(upperCase + "\n" + lowerCase);
		usingRegularExpression(input);
	}

	public static void usingRegularExpression(String input) {
		Pattern lowerCasePattern = Pattern.compile("[a-z]");
		Pattern uppwerCasePattern = Pattern.compile("[A-Z]");

		Matcher object = lowerCasePattern.matcher(input);
		int lowerCase = 0;
		while (object.find()) {
			lowerCase++;
		}
		object = uppwerCasePattern.matcher(input);
		int upperCase = 0;
		while (object.find()) {
			upperCase++;
		}

		System.out.println(upperCase + "\n" + lowerCase);

	}
}
