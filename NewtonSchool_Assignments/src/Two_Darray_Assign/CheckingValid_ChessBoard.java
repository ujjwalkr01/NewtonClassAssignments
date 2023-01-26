package Two_Darray_Assign;

import java.util.Scanner;

public class CheckingValid_ChessBoard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int startValue = 1;
		if (isValidChessBoard(arr, n, startValue)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean isAlternateOrder(int[][] arr, int n, int row, int startValue) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && arr[row][i] != startValue) {
				return false;
			} else if (i % 2 != 0 && arr[row][i] != (startValue + 1) % 2) {
				return false;
			}
		}
		return true;
	}

	public static boolean isValidChessBoard(int arr[][], int n, int startValue) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && !isAlternateOrder(arr, n, i, startValue)) {
				return false;
			} else if (i % 2 != 0 && !isAlternateOrder(arr, n, i, (startValue + 1) % 2)) {
				return false;
			}
		}
		return true;
	}

}
