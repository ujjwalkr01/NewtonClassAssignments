package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAnd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- != 0) {
			int n = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			maxAnd(arr, n);
		}

	}

	private static void maxAnd(int[] arr, int n) {

		Arrays.sort(arr);

		int val = 0, maxAnd = Integer.MIN_VALUE;

		for (int i = 0; i < n - 1; i++) {
			val = arr[i] & arr[i + 1];
			maxAnd = Math.max(maxAnd, val);
		}
		System.out.println(maxAnd);
	}

}
