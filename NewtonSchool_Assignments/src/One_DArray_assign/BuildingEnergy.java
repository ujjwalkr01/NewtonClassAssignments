package One_DArray_assign;

import java.util.Scanner;

public class BuildingEnergy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = totalEnergy(arr, n);
		System.out.println(res);
	}

	private static int totalEnergy(int[] arr, int n) {

		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				sum += 2 * (arr[i + 1] - arr[i]);
			} else {
				sum += arr[i] - arr[i + 1];
			}
		}
		return sum;
	}

}
