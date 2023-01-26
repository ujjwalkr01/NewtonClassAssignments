package Two_Darray_Assign;

import java.util.Scanner;

public class MinSteps_ValidChessboard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int startwith0 = countSteptoMakeChessboard(arr, n, 0);
		int startwith1 = countSteptoMakeChessboard(arr, n, 1);

		System.out.println(Math.min(startwith0, startwith1));

	}

	public static int stepsTomakeAlternateChessboard(int arr[][], int n, int row, int startValue) {
		int step = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && arr[row][i] != startValue) {
				step++;
			} else if (i % 2 != 0 && arr[row][i] != (startValue + 1) % 2) {
				step++;
			}
		}
		return step;
	}

	public static int countSteptoMakeChessboard(int arr[][], int n, int startValue) {
		int step = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				step = step + stepsTomakeAlternateChessboard(arr, n, i, startValue);
			} else {
				step = step + stepsTomakeAlternateChessboard(arr, n, i, (startValue + 1) % 2);
			}
		}
		return step;
	}

}
