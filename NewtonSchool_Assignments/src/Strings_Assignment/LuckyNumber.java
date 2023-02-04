package Strings_Assignment;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		checkNumisLucky(str, n);
	}

	private static void checkNumisLucky(String str, int n) {

		int left_sum = 0, right_sum = 0;

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			left_sum += ch - '0';
		}
		System.out.println(left_sum);
		for (int j = n; j < 2 * n; j++) {
			char ch = str.charAt(j);
			right_sum += ch - '0';
		}
		System.out.println(right_sum);
		if (left_sum == right_sum) {
			System.out.println("LUCKY");
		} else {
			System.out.println("UNLUCKY");
		}

	}

}
