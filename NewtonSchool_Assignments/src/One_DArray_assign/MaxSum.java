package One_DArray_assign;

import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test case:");
		int t = sc.nextInt();

		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = maxSum(arr, n);
		System.out.println(res);

	}

	private static int maxSum(int[] arr, int n) {
		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			} else
				continue;
		}
		return sum;

	}

}
