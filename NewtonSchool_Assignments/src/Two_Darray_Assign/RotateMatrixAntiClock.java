package Two_Darray_Assign;

import java.util.Scanner;

public class RotateMatrixAntiClock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); // no of rows
		int col = sc.nextInt(); // no of columns

		int matrix[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		rotateby90(matrix, row, col);
		printMatrix(matrix,row,col);
	}

	private static void printMatrix(int[][] matrix, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotateby90(int[][] matrix, int row, int col) {

		findTranspose(matrix, row, col);
		reverseMatrix(matrix, row, col);
	}

	private static void reverseMatrix(int[][] matrix, int row, int col) {

		for (int i = 0; i < row; i++) {
			int low = 0, high = row - 1;

			while (low < high) {
				int temp = matrix[low][i];
				matrix[low][i] = matrix[high][i];
				matrix[high][i] = temp;
				low++;
				high--;
			}
		}
	}

	private static void findTranspose(int[][] matrix, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < col; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
	}

}
