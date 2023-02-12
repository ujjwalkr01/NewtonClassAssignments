package Sorting_assign;

import java.util.Scanner;

public class CountOfSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int low = 0, high = n - 1;
		mergeSort(arr, low, high);
		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print(arr.length - 1);
	}

	private static void mergeSort(int[] arr, int low, int high) {

		if (high > low) {
			int mid = low + (high - low) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int n1 = mid - low + 1, n2 = high - mid;

		int left[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			left[i] = arr[i + low];
		}
		int right[] = new int[n2];
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = low;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i];
				i++;
			} else {
				arr[k++] = right[j];
				j++;
			}

		}
		while (i < n1) {
			arr[k++] = left[i];
			i++;
		}
		while (j < n2) {
			arr[k++] = right[j];
			j++;
		}

	}
}