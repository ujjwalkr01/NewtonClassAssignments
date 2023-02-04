package Strings_Assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char arr[] = str.toCharArray();

		reverseString(arr);

	}

	private static void reverseString(char arr[]) {

		int i = 0, j = arr.length - 1;

		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		printArray(arr);

	}

	private static void printArray(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
