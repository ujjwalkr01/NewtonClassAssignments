package BinarySearch_Assignments;

import java.util.Scanner;

public class SmallerElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int Q = sc.nextInt();
		while (Q-- != 0) {
			int k = sc.nextInt();

			int count = checkAllSmallerElement(arr, n, k);
			System.out.println(count);
		}
	}

	private static int checkAllSmallerElement(int[] arr, int n, int k) {

		if (k == arr[0]) {
			return 1;
		}
		if (k <= arr[0]) {
			return 0;
		}
		if (k >= arr[n - 1]) {
			return n;
		}

		int low = 0, high = n - 1, index=n;

		while (low <= high) {
			int mid = (low + high) / 2;

		    if(arr[mid]<=k) {
		    	low=mid+1;
		    }else {
		    	high=mid-1;
		    	index=mid;
		    }
		}
		return index;
	}

}
