package One_DArray_assign;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfLargestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxSumof4Element(arr, n));
	}

	private static int maxSumof4Element(int[] arr, int n) {

		Arrays.sort(arr);
		int sum = 0;

		for (int i = n-1; i >=n-4; i--) {
			sum+=arr[i];		
		}
		return sum;
	}

}
