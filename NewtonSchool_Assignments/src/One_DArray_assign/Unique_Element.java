package One_DArray_assign;

import java.util.Arrays;

public class Unique_Element {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 2, 2 };
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		removeDuplicates(arr, n);
	}

	private static void removeDuplicates(int[] arr, int n) {

		int res = 1;
		for (int i = 1; i < n; i++) {
			if (arr[res - 1] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}

		for (int i = 0; i < res; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
