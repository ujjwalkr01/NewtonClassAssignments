package BinarySearch_Assignments;

import java.util.Scanner;

public class MinAbsDiff_inTwoarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		minabsdifference(a, b, n);
		minabsdifference1(a, b, n);

	}

	private static void minabsdifference1(int[] a, int[] b, int n) {

		int maxDiff = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int diff = Math.abs(a[i] - b[j]);
				maxDiff = Math.min(maxDiff, diff);
			}
			
		}
		System.out.println(maxDiff);
	}

	private static void minabsdifference(int[] a, int[] b, int n) {

		int i = 0, j = n - 1;
		int maxDiff = Integer.MAX_VALUE;
		while (i != n) {
			int diff = Math.abs(a[i] - b[j]);
			maxDiff = Math.min(maxDiff, diff);
			j--;

			if (j < 0) {
				j = n - 1;
				i++;
			}
		}
		System.out.println(maxDiff);
	}

}
