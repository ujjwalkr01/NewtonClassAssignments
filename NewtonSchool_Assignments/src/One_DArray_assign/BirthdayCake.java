package One_DArray_assign;

import java.util.Scanner;

public class BirthdayCake {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = countOfcandle(arr, n);
		System.out.println(res);
	}

	private static int countOfcandle(int[] arr, int n) {
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (max == arr[i]) {
				count++;
			}
		}
		return count;
	}

}
