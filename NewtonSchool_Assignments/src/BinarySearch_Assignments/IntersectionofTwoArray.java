package BinarySearch_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofTwoArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("now for the element of b");
		int m = sc.nextInt();
		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		compareElement(a, b, n, m);

	}

	private static void compareElement(int[] a, int[] b, int n, int m) {

		Arrays.sort(b);
  
		for (int i = 0; i < m; i++) {
			int x = b[i];
			int res = binarySearch(a, n, x);
			//System.out.print(res + " ");
			if (res != -1) {
				System.out.print(res + " ");
			}
		}
		
	}

	private static int binarySearch(int[] a, int n, int x) {

		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid] == x) {
				return a[mid];
			} else if (a[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

}
