package One_DArray_assign;

import java.util.Scanner;

public class Hip_Hip_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		reverseArray(arr, n);
		//print the reverse array.....
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		int sum = 0;
		long product = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				product *= arr[i];
			else
				sum += arr[i];
		}
		System.out.println(sum + " " + product);
	}

	private static void reverseArray(int[] arr, int n) {

		int i = 0;
		int j = n - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
