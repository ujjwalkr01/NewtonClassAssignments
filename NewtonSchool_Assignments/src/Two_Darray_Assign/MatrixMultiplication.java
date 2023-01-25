package Two_Darray_Assign;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); // no of rows
		int col = sc.nextInt(); // no of columns

		int arr[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("now enter the element for the second matrix");
		int row1 = col; // no of rows
		int col1 = sc.nextInt(); // no of columns

		int arr1[][] = new int[row1][col1];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		matrixMultiply(arr, row, col, arr1, row1, col1);
	}

	private static void matrixMultiply(int[][] arr, int row, int col, int[][] arr1, int row1, int col1) {

//		if (row1 != col) {
//			System.out.println("Matrix multiplication is not possible");
//			return;
//		}

		int arr2[][] = new int[row][col1];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col1; j++) {
				for (int k = 0; k < row; k++) {
					arr2[i][j] += arr[i][k] * arr1[k][j];
				}
			}
		}
		printArray(arr2, row, col1);
	}

	private static void printArray(int[][] arr2, int row, int col1) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
