package One_DArray_assign;

import java.util.Scanner;

public class SubarraygivenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// no of elements
		int value = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		subarraysumValue(arr, n, value);
	}

	private static void subarraysumValue(int[] arr, int n, int sum) {

		int curr_sum = arr[0], start = 0;
		for (int i = 1; i < n; i++) {

			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if (curr_sum == sum) {
				System.out.println(start + " " + (i - 1));
				break;
			}
			if (i < n) {
				curr_sum += arr[i];
			}
		}
		if (curr_sum != sum) {
			System.out.println("-1");
		}

	}

}
