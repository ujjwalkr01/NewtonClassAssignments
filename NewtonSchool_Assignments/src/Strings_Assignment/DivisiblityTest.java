package Strings_Assignment;

import java.util.Scanner;

public class DivisiblityTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		checkDivisiblity(str);
	}

	private static void checkDivisiblity(String str) {

		long sumofDigit = 0;
		int single = 0;
		for (int i = 0; i < str.length(); i++) {
			sumofDigit += str.charAt(i) - '0';

			if (i == str.length() - 1) {
				single = str.charAt(i) - '0';
			}
		}

		if (sumofDigit % 3 == 0 && single == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
