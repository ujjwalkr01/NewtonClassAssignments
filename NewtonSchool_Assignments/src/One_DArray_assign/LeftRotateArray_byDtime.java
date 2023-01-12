package One_DArray_assign;

import java.util.Scanner;

public class LeftRotateArray_byDtime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		d = d % n;
		// reverse d elements
		reverseAlgo(arr, 0, d - 1);
		// reverse d and n-1 elements
		reverseAlgo(arr, d, n - 1);
		// reverse full array
		reverseAlgo(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void reverseAlgo(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
