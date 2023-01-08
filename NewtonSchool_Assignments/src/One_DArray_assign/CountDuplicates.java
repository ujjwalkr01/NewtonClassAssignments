package One_DArray_assign;

import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		sortArray(arr, N);
	}

	private static void sortArray(int[] arr, int n) {

//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		

		countFrequency(arr, n);
	}

	private static void countFrequency(int[] arr, int n) {

		int count;
		for (int i = 0; i < n; i+=count) {
			count = 0;
			for (int j = i; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}else
					 break;
			}
			if (count >= 2) {
				System.out.println(arr[i] + " " + count);
			}
		}
	}

}
