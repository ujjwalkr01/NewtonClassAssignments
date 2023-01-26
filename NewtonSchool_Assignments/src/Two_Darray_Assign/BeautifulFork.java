package Two_Darray_Assign;

import java.util.Scanner;

public class BeautifulFork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- != 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int point1[][] = computeAllPoints(x, y);
			int point2[][] = computeAllPoints(a, b);

			if (checkCommonPoint(point1, point2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	public static int[][] computeAllPoints(int x, int y) {
		int possiblePoint[][] = new int[][] { { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, 2 }, { -2, 1 },
				{ -2, -1 }, { -1, -2 } };

		int point[][] = new int[8][2];
		for (int i = 0; i < 8; i++) {
			int X = possiblePoint[i][0] + x;
			int Y = possiblePoint[i][1] + y;

			if (isValid(X, Y)) {
				point[i][0] = X;
				point[i][1] = Y;
			} else {
				point[i][0] = -1;
				point[i][1] = -1;
			}
		}
		return point;
	}

	public static boolean isValid(int x, int y) {
		if (x < 1 || y < 1 || x > 8 || y > 8) {
			return false;
		} else
			return true;
	}
	
	private static boolean checkCommonPoint(int[][] point1, int[][] point2) {

		for (int i = 0; i < point2.length; i++) {
			if (searchCommonPoint(point1, point2[i][0], point2[i][1])) {
				return true;
			}
		}
		return false;
	}

	private static boolean searchCommonPoint(int[][] point1, int x, int y) {
		if (x == -1 || y == -1) {
			return false;
		}
		for (int i = 0; i < point1.length; i++) {
			if (point1[i][0] == x && point1[i][1] == y) {
				return true;
			}
		}
		return false;
	}


}
