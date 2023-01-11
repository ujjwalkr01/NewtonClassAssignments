package One_DArray_assign;

public class SumOfsubarrays {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3 };

		int res = subarraysSum(arr);
		System.out.println(res);
	}

	private static int subarraysSum(int[] arr) {

		int temp = 0, sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			temp = 0;
			for (int j = i; j < n; j++) {
				temp += arr[j];  //for generating all the subarrays...
				sum += temp;     //calculate all the sum of the subarrays for each element...
			}
		}
		return sum;
	}

}
