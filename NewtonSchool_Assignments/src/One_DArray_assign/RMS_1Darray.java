package One_DArray_assign;

import java.util.Scanner;

public class RMS_1Darray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		calculateMean(arr, n);
	}

	private static void calculateMean(int[] arr, int n) {

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.pow(arr[i], 2);
		}

		double mean = sum / n;
		System.out.println(String.format("%.1f", mean));
		double res = Math.sqrt(mean);

		System.out.print(String.format("%.6f", res));
	}

}
