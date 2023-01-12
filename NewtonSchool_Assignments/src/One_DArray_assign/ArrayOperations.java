package One_DArray_assign;

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		min_max(arr, n);
	}

	private static void min_max(int[] arr, int n) {

		int max = arr[0], min = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] -= min;
				min = Math.min(arr[i], min);
				max = Math.max(arr[i], max);
			} else {
				arr[i] += max;
				max = Math.max(arr[i], max);
				min = Math.min(arr[i], min);
			}
		}
		System.out.println(max + " " + min);

	}

}
