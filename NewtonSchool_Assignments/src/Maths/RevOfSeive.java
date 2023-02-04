package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class RevOfSeive {

	public static void main(String[] args) {

		boolean isPrime[] = new boolean[10000001];
		Arrays.fill(isPrime, true);

		for (int i = 2; i * i <= 10000000; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= 10000000; j += i) {
					isPrime[j] = false;
				}
			}
		}

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int count = 0;

			for (int i = n; i > n / 2; i--) {
				if (isPrime[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
