package problems;

import java.util.Scanner;
import java.util.regex.Pattern;

class UsernameValidator {
	/*
	 * Write regular expression here.
	 */
	public static final String regularExpression = "^[A-Z||a-z][A-z 0-9]{7,29}$";
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int input = s.nextInt();
		validate(input);
	}

	public static void validate(int input) {
		if (input > 0 && input <= 100) {
			int counter = 0;
			while (counter++ < input) {
				String username = s.nextLine();
				System.out
						.println(Pattern.matches(regularExpression, username) ? "Valid"
								: "Invalid");
			}
		} else
			System.out.println("Invalid");
	}

}
