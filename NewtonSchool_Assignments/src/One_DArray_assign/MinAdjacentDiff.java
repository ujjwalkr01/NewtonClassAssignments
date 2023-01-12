package One_DArray_assign;

import java.util.Scanner;

public class MinAdjacentDiff {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = minadjDiff(arr, n);
		System.out.println(res);
	}

	private static int minadjDiff(int[] arr, int n) {

		int minSub = Math.abs(arr[0] - arr[n - 1]);

		for (int i = 0; i < n - 1; i++) {
			int diff = Math.abs(arr[i] - arr[i + 1]);
			minSub = Math.min(diff, minSub);
		}
		return minSub;
	}

}
