package Two_Darray_Assign;

import java.util.Scanner;

public class PrintElementAnticlockwise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		printAnticlockWise(arr, n);
	}

	private static void printAnticlockWise(int[][] arr, int n) {

		int left = 0, right = n - 1;
		int top = 0, down = n - 1;

		while (true) {
			topTodown(arr, top, down, left);
			left++;
			if (left > right) {
				break;
			}

			leftToright(arr, left, right, down);
			down--;
			if (top > down) {
				break;
			}

			downTotop(arr, down, top, right);
			right--;
			if (left > right) {
				break;
			}

			rightToleft(arr, right, left, top);
			top++;
			if (top > down) {
				break;
			}
		}
	}

	private static void topTodown(int[][] arr, int start, int end, int left) {

		for (int i = start; i <= end; i++) {
			System.out.print(arr[i][left] + " ");
		}
	}

	private static void leftToright(int[][] arr, int start, int end, int down) {

		for (int i = start; i <= end; i++) {
			System.out.print(arr[down][i] + " ");
		}
	}

	private static void downTotop(int[][] arr, int start, int end, int right) {

		for (int i = start; i >= end; i--) {
			System.out.print(arr[i][right] + " ");
		}
	}

	private static void rightToleft(int[][] arr, int start, int end, int top) {

		for (int i = start; i >= end; i--) {
			System.out.print(arr[top][i] + " ");
		}
	}

}
