package TwoPointers;

import java.util.Scanner;

public class ColourHouseDist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = findMaxDist(arr, n);
		System.out.println(res);
	}

	private static int findMaxDist(int[] arr, int n) {

		int i = 0, j = n - 1;
		while (arr[0] == arr[j]) {
			j--;
			if(j==0) {
				break;
			}
		}
		while (arr[n - 1] == arr[i]) {
			i++;
			if(i==n-1) {
				break;
			}
		}

		return Math.max(n - 1 - i, j);
	}

}
