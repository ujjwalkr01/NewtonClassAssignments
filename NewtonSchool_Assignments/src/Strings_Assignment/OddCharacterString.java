package Strings_Assignment;

import java.util.Scanner;

public class OddCharacterString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		printOddstring(str);
	}

	private static void printOddstring(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}

}
