package One_DArray_assign;

import java.util.Scanner;

public class FindPositionofElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- != 0) {
			int n = sc.nextInt();
			int element = sc.nextInt();

			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			if (!findeleIndex(arr, n, element)) {
				System.out.println("Not Found");
			}
//			System.out.println();
		}
	}

	private static boolean findeleIndex(int[] arr, int n, int element) {
		boolean isPresent = false;

		for (int i = 0; i < n; i++) {
			if (arr[i] == element) {
				isPresent = true;
				System.out.print(i + " ");
			}
		}
		return isPresent;
	}

}
