package BinarySearch_Assignments;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		findSqrt(num);
		if (findSqrt(num) != -1)
			System.out.println("Yes its a perfect square");
		else
			System.out.println("No");
	}

	private static long findSqrt(long num) {
		long low = 0, high = num;
		// applying the binary search
		while (low <= high) {
			long mid = (low + high) / 2;
			long square = mid * mid;

			if (square == num) {
				return mid;
			} else if (square > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return -1;
	}

}
