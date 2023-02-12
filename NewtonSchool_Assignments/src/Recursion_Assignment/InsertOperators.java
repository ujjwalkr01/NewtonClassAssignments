package Recursion_Assignment;

import java.util.Scanner;

public class InsertOperators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();

		long arr[] = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		long sum = 0;
		if (ifvalueKexist(arr, n - 1, sum, k)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean ifvalueKexist(long[] arr, int index, long sum, long k) {

		if (index == -1) {
			return (sum == k);
		}

		return (ifvalueKexist(arr, index - 1, sum + arr[index], k)
				|| ifvalueKexist(arr, index - 1, sum - arr[index], k));
	}

}
