package ModuleContestQuestions;

import java.util.Scanner;

public class MinNoofNotes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- != 0) {
			int x = sc.nextInt();

			System.out.println(findMin_notes(x));
		}
	}

	private static int findMin_notes(int note) {

		int note100 = note / 100;
		note = note % 100;

		int note50 = note / 50;
		note = note % 50;

		int note10 = note / 10;
		note = note % 10;

		int note5 = note / 5;
		note = note % 5;

		int note2 = note / 2;
		note = note % 2;

		int note1 = note / 1;
		note = note % 1;

		int sum = note100 + note50 + note10 + note5 + note2 + note1;
		return sum;
	}

}
