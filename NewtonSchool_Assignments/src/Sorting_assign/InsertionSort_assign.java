package Sorting_assign;

import java.util.Scanner;

public class InsertionSort_assign {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		insertionSort(arr, n);
	}

	private static void insertionSort(int[] arr, int n) {

		for (int i = 1; i < n; i++) {
			int currentElement = arr[i];
			int j = i - 1;

			while (j >= 0 && currentElement < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = currentElement;

		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
