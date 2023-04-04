package ModuleContestQuestions;

import java.util.Scanner;

public class DownloadTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fileSize = sc.nextInt();
		int internet_Speed = sc.nextInt();

		System.out.println(findTimeTaken(fileSize, internet_Speed));
	}

	private static int findTimeTaken(int fileSize, int internet_Speed) {

		fileSize = fileSize * 8;

		return (fileSize / internet_Speed);

	}

}
