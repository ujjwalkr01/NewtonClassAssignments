package BinarySearch_Assignments;

import java.util.Scanner;

public class FindtheValueOFx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();

		long res = findx(k);
		System.out.println(res);
	}

	private static long findx(long k) {

		long low = 1, high = Integer.MAX_VALUE;

		while (low <= high) {
			long mid = (low + high) / 2;
			long x = (mid * mid) + (3 * mid);

			if (x == k) {
				return mid;
			} else if (x > k) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
