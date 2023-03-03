package Hashing_Assign;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str=sc.next();

		int count = removeDuplicate(str, n);
		System.out.println(count);
	}

	private static int removeDuplicate(String str, int n) {

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(str.charAt(i));
		}
		return set.size();
	}

}
