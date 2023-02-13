package Sorting_assign;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long arr[] = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}

		System.out.println(findMinsum(arr, n, k));
	}

	private static long findMinsum(long[] arr, int n, int k) {

		
		Arrays.sort(arr);
		int index = n - 1;
         
		while (index > 0 && arr[index] > 0 && k-- != 0) {
			arr[index] = -arr[index];
			index--;
		}
		long sum = 0;
		for (long ele : arr) {
			sum += ele;
		}

		return sum;
	}

}
