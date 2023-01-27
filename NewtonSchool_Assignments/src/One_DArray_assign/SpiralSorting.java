package One_DArray_assign;

import java.util.Scanner;

public class SpiralSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (sprialSorting(arr, n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean sprialSorting(int[] arr, int n) {

		int i = 0, j = n - 1;
		while (i < j) {
			if (arr[i] > arr[j] || arr[j] > arr[i + 1]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
