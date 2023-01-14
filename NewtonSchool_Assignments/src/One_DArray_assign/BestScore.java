package One_DArray_assign;

import java.util.Scanner;

public class BestScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = checkScore(arr, n);
		System.out.println(res);
	}

	private static int checkScore(int[] arr, int n) {
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		if (sum % 10 == 0) {
			int max = 0;
			for (int j = n - 1; j >= 0; j--) {
				int temp = sum - arr[j];

				if (temp % 10 == 0) {
					temp = 0;
				}
				max = Math.max(max, temp);
			}
			return max;
		} else {
			return sum;
		}

	}

}
