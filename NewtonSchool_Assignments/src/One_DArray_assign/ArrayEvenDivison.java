package One_DArray_assign;

public class ArrayEvenDivison {

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 4, 6, 8, 1 };

		System.out.println(countTheOperation(arr));
	}

	private static int countTheOperation(int[] arr) {

		boolean isEven = true;
		int count = 0;

		while (isEven) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					arr[i] /= 2;
				} else {
					isEven = false;
					// count = 0;
					break;
				}
			}
			if (isEven) {
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return count;

	}

}
