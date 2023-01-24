package TwoPointers;

import java.util.Scanner;

public class SumofCubes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		if (sumOFcube(n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean sumOFcube(long n) {

		long low = 1, high = (int) Math.cbrt(n);

		while (low <= high) {
			long current = (low * low * low) + (high * high * high);

			if (current == n) {
				return true;
			} else if (current < n) {
				low++;
			} else {
				high--;
			}
		}
		return false;
	}

}
