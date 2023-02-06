package Strings_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class MakeTiny {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		if (compareStrings(s, t)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static boolean compareStrings(String s, String t) {

		char ch[] = s.toCharArray();
		Arrays.sort(ch);
//		s = new String(ch);
		System.out.println(s);

		char arr[] = t.toCharArray();
		Arrays.sort(arr);
	//	t = new String(arr);
		System.out.println(t);

		int min = ch[0];
		int max = arr[arr.length-1];

		if (min < max) {
			return true;
		} else {
			return false;
		}

	}

}
