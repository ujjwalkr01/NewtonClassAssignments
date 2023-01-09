package One_DArray_assign;

import java.util.Scanner;

public class MaxFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		countMaxfre(arr, n);
	}

	private static void countMaxfre(int[] arr, int n) {

		int maxValue = 0, maxCount = 1;

		for (int i = 0; i < n; i++) {
			int count = 1;

			for (int j = i + 1; j < n; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (maxCount == count) {
				maxValue = Math.max(maxValue, arr[i]);
			} else if (maxCount < count) {
				maxCount = count;
				maxValue = arr[i];
			}
		}
		System.out.println(maxValue);
	}

}
