package One_DArray_assign;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res[] = findMultiple(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] findMultiple(int[] arr, int n) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] % arr[i] == 0) {
					count++;
				}
			}
			arr[i] = count;
			count=0;
		}

		return arr;
	}

}
