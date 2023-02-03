package One_DArray_assign;

import java.util.Arrays;
import java.util.Scanner;

public class CitationIndexCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		System.out.println(calculateH_index(arr, n));
	}

	private static int calculateH_index(int[] arr, int n) {

		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int quantity = n - mid;

			if (arr[mid] == quantity) {
				return arr[mid];
			} else if (arr[mid] > quantity) {
				high = mid + 1;
			} else {
				low = mid + 1;
			}
		}
		return n - low;
	}

}
