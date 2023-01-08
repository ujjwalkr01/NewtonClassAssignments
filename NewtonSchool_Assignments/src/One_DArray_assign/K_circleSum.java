package One_DArray_assign;

import java.util.Scanner;

public class K_circleSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int K = sc.nextInt(); // denotes the length of the subarray we have to find the sum for every element
		KcircleSum(arr, n, K);
	}

	private static void KcircleSum(int[] arr, int n, int K) {

		for (int i = 0; i < n; i++) {
			int sum = 0;
			int count = K;
			for (int j = i; j < n; j++) {
				if (count > 0) {
					sum = sum + arr[j];
					count--;
				} else {
					break;
				}
				if (j == n - 1) {
					j = -1;
				}

			}
			System.out.print(sum + " ");
		}
	}

}
