package One_DArray_assign;

import java.util.Scanner;

public class RosesQuestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int roses = sc.nextInt();

		int countYellow = 0;
		//i=2 because it yellow is second color
		//and after every 2 color yellow comes.....that why we incremented i+3
		for (int i = 2; i <= roses; i += 3) {
			countYellow++;
		}

		System.out.println(countYellow);
	}

}
