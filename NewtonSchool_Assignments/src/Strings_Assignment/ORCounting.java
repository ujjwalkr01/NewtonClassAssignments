package Strings_Assignment;

import java.util.Scanner;

public class ORCounting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int res = checkPossibleWays(a, b);
		System.out.println(res);
	}

	private static int checkPossibleWays(String a, String b) {

		int res = 1;
		for (int i = 0; i < a.length(); i++) {
			int source = a.charAt(i) - '0';
			int target = b.charAt(i) - '0';

			if (source == 1) {
				if (target == 1) {
					res *= 2;
				} else {
					res *= 0;
				}
			} else {
				if (target == 1) {
					res *= 1;
				} else {
					res *= 1;
				}
			}
		}
		return res;
	}

}
