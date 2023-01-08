package One_DArray_assign;

import java.util.Scanner;

public class CountOfBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		countZeroOne(arr, n);
	}

	private static void countZeroOne(int[] arr, int n) {

		int countOfOne = 0, countOfZero = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				countOfOne++;
			} else {
				countOfZero++;
			}
		}
		System.out.println(countOfOne + " " + countOfZero);

	}

}
