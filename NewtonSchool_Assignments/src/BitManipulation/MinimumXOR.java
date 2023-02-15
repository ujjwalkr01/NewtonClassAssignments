package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumXOR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(calculateMinXor(arr, n));
	}

	private static int calculateMinXor(int[] arr, int n) {

		Arrays.sort(arr);

		int val = 0, min_Xor = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++) {
			val = arr[i] ^ arr[i + 1];
			min_Xor = Math.min(min_Xor, val);
		}

		return min_Xor;
	}

}
