package One_DArray_assign;

public class AlternateSum_product {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int sum = 0, product = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				product *= arr[i];
			} else {
				sum += arr[i];
			}
		}
		System.out.println(sum + " " + product);
	}

}
