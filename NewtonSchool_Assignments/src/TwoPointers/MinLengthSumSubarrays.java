package TwoPointers;

import java.util.Scanner;

public class MinLengthSumSubarrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter the value of K");
		long k = sc.nextLong();

		long arr[] = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}

		System.out.println(findMinLength(arr, n, k));

	}

	private static long findMinLength(long[] arr, int n, long k) {


		long curr_sum = 0;
		int left = 0, right = 0, minlength = Integer.MAX_VALUE;

		while (right < n) {

			curr_sum += arr[right];
			while (curr_sum >= k) {
				minlength = Math.min(minlength, right - left + 1);
				curr_sum -= arr[left];
				left++;
			}
			right++;
		}
		return minlength;
	}

}
