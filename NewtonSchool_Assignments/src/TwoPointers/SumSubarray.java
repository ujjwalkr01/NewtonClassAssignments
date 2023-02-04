package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class SumSubarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long arr[] = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		System.out.println(findMinlength(arr, n, k));
	}

	private static long findMinlength(long[] arr, int n, long k) {

		int left = 0, right = 0, min_len = Integer.MAX_VALUE;
		long curr_sum = 0;

		while (right < n) {
			curr_sum += arr[right];
			while (curr_sum >= k) {
				min_len = Math.min(min_len, right - left + 1);
				curr_sum -= arr[left];
				left++;
			}
			right++;
		}
		return min_len;
	}

}
