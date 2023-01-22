package TwoPointers;

import java.util.Scanner;

public class MaxComplement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = maxProduct(arr, n);
		System.out.println(res);
	}

	private static int maxProduct(int[] arr, int n) {

		int i = 0, j = n - 1;
		int maxProduct = 0;
		while (i < j) {
			int product = arr[i] * arr[j];
			maxProduct = Math.max(maxProduct, product);
			i++;
			j--;
		}
		return maxProduct;
	}

}
