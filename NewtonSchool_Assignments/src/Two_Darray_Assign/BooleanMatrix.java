package Two_Darray_Assign;

import java.util.Scanner;

public class BooleanMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // no of rows
		int n = sc.nextInt(); // no of columns

		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			if (checkIfBoolean(arr, m, n, i)) {
				modifyArray(arr, m, n, i);
			}
		}
		printArray(arr, m, n);

	}

	private static boolean checkIfBoolean(int[][] arr, int m, int n, int i) {

		for (int j = 0; j < n; j++) {
			if (arr[i][j] == 1) {
				return true;
			}
		}
		return false;
	}

	private static void modifyArray(int[][] arr, int m, int n, int i) {

		for (int j = 0; j < n; j++) {
			arr[i][j] = 1;
		}
	}

	private static void printArray(int[][] arr, int m, int n) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
