package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfPrime {

	public static void main(String[] args) {

		boolean isprime[] = seiveOfEratosthene(100000);

		int countPrime[] = countOfprime(isprime);

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- != 0) {
			int n = sc.nextInt();
		    
			System.out.println(countPrime[n]);
		}
	}

	private static int[] countOfprime(boolean[] isprime) {

		int countPrime[] = new int[isprime.length];
		int count = 0;

		for (int i = 2; i < isprime.length; i++) {
			if (isprime[i]) {
				count++;
			}
			countPrime[i]=count;
		}
		return countPrime;
	}

	private static boolean[] seiveOfEratosthene(int N) {

		boolean isprime[] = new boolean[N + 1];

		Arrays.fill(isprime, true);

		for (int i = 2; i * i <= N; i++) {
			if (isprime[i]) {
				for (int j = i * i; j <= N; j += i) {
					isprime[j] = false;
				}
			}
		}
		return isprime;
	}

}
