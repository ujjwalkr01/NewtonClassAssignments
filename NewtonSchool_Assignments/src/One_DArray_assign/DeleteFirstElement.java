package One_DArray_assign;

import java.util.Scanner;

public class DeleteFirstElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		deleteELe(arr,n);
		
	}

	private static void deleteELe(int[] arr, int n) {

		int res=0;
		for(int i=1;i<n;i++) {
			arr[res]=arr[i];
			res++;
		}
		for(int i=0;i<res;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
