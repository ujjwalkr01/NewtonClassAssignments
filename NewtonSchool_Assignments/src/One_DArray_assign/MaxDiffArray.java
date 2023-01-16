package One_DArray_assign;

public class MaxDiffArray {

	public static void main(String[] args) {

		MaxDiffArray max = new MaxDiffArray();
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int maxDiff = maxIndexDiff(arr, n);
		System.out.println(maxDiff);
	}

	private static int maxIndexDiff(int[] arr, int n) {
      /*
       * we have to find the pairs of where a[i]>a[j];
       */
		//we have created the array for finding the max of the adjacent element
		int rightMax[] = new int[n];
		rightMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
		}

		int maxDiff = Integer.MIN_VALUE;
		int i = 0, j = 0;
     //here we are comparing the element for the count of the max pairs...
		while (i < n && j < n) {

			if (rightMax[j] > arr[i]) {
				maxDiff = Math.max(maxDiff, j - i);
				j++;
			} else {
				i++;
			}
		}

		return maxDiff;
	}

}
