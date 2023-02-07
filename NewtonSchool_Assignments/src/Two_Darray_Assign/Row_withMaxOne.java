package Two_Darray_Assign;

import java.util.Scanner;

public class Row_withMaxOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(checkmaxOne(arr, row, col));
	}

	private static int checkmaxOne(int[][] arr, int row, int col) {

		int max = 0, count = 0, index = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 1) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				index = i;
			}
			count = 0;
		}
		return index;
	}

}
