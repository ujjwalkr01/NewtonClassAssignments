package Two_Darray_Assign;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of rows
		int m = sc.nextInt(); // no of columns
		int arr[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		spiralOrder(arr, n, m);

	}

	public static void spiralOrder(int arr[][], int n, int m) {
		int left = 0, right = m - 1;
		int top = 0, down = n - 1;

		while (true) {
			leftToright(arr, left, right, top);
			top++;
			if (top > down) {
				break;
			}

			topTodown(arr, top, down, right);
			right--;
			if (left > right) {
				break;
			}

			rightToleft(arr, right, left, down);
			down--;
			if (top > down) {
				break;
			}
			
			downTotop(arr,down,top,left);
			left++;
			if(left>right) {
				break;
			}
		}
	}

	public static void leftToright(int arr[][], int start, int end, int row) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[row][i] + " ");
		}
	}

	public static void topTodown(int arr[][], int start, int end, int col) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i][col] + " ");
		}
	}

	public static void rightToleft(int arr[][], int end, int start, int row) {
		for (int i = end; i >= start; i--) {
			System.out.print(arr[row][i] + " ");
		}
	}

	public static void downTotop(int arr[][], int end, int start, int col) {
		for (int i = end; i >= start; i--) {
			System.out.print(arr[i][col] + " ");
		}
	}

}
