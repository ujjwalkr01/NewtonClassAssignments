package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPrimeDivisor {

	public static void main(String[] args) {

		boolean isPrime[] = seiveOfEratosthene(100000);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(checkLargePrimeDivisor(isPrime, num));
	}

	private static int checkLargePrimeDivisor(boolean[] isPrime, int num) {

		int res = 1;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i] && i <= num) {
				if (num % i == 0) {
					res = i;
				}
			}
		}
		return res;
	}

	private static boolean[] seiveOfEratosthene(int n) {

		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;

		for (int i = 2; i*i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		return isPrime;
	}

}
