package One_DArray_assign;

import java.util.Scanner;

public class FindtheMissingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findMissingNum(arr, n));
	}

	private static int findMissingNum(int[] arr, int n) {

		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += arr[i];
		}
         System.out.println(sum);
		int res = n * (n + 1) / 2;
		System.out.println(res);
		int missingNum = sum - res;
		return missingNum;
	}

}
