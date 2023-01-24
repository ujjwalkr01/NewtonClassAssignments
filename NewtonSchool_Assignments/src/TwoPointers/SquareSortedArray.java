package TwoPointers;

import java.util.*;

public class SquareSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
//Array must be sorted for two pointer
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Squareof(arr, n);
	}

	private static void Squareof(int[] arr, int n) {

		int res[] = new int[n];
		int left = 0, right = n - 1;

		for (int i = n - 1; i >= 0; i--) {
			if (Math.abs(arr[left]) > arr[right]) {
				res[i] = arr[left] * arr[left];
				left++;
			} else {
				res[i] = arr[right] * arr[right];
				right--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
