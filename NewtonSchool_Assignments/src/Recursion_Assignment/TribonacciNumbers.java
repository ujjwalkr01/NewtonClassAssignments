package Recursion_Assignment;

import java.util.Scanner;

public class TribonacciNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(tribonacciNum(n));
	}

	private static int tribonacciNum(int n) {

		if (n == 1 || n == 2) {
			return 0;
		}
		if (n == 3) {
			return 1;
		}
		return tribonacciNum(n - 1) + tribonacciNum(n - 2) + tribonacciNum(n - 3);
	}

}
