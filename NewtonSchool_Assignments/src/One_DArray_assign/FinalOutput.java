package One_DArray_assign;

import java.util.Scanner;

public class FinalOutput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long mod = 1000000007;
		System.out.println(calculateProduct(arr, n, mod));

	}

	private static long calculateProduct(int[] arr, int n, long mod) {

		long product = 1;
		for (int i = 0; i < n; i++) {
			product = ((product % mod) * (arr[i] % mod)) % mod;
		}

		return product;
	}

}
