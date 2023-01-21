package TwoPointers;

import java.util.Scanner;

public class MergerTwoSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		mergeArray(arr1, n, arr2, m);

	}

	private static void mergeArray(int[] arr1, int n, int[] arr2, int m) {

		int i = 0, j = 0, k = 0;
		int arr3[] = new int[n + m];

		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			} else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < n) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while (j < m) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		printArray(arr3, n + m);
	}

	private static void printArray(int[] arr3, int k) {

		for (int i = 0; i < k; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
