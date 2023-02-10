package Sorting_assign;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		selectionSort(arr, n);
	}

	private static void selectionSort(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			swap(arr, min_idx, i);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void swap(int[] arr, int min_idx, int i) {

		int temp = arr[i];
		arr[i] = arr[min_idx];
		arr[min_idx] = temp;
	}

}
