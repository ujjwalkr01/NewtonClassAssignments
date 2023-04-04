package ModuleContestQuestions;

import java.util.Scanner;

public class N_Nthdivisble {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(divisiblebyN(n));
	}

	private static int divisiblebyN(int n) {

		int res = 0;
		for (int i = 0; i < n; i++) {
			res = n * i;
		}
		return res;
	}

}
