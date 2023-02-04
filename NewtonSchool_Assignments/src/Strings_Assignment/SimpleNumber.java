package Strings_Assignment;

import java.util.Scanner;

public class SimpleNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		if(checktheCount(str)) {
			System.out.println("Awesome");
		}else {
			System.out.println("Good");
		}
	}

	private static boolean checktheCount(String str) {

		int candidate=str.charAt(0)-'0';
		int count=1;
		
		for(int i=1;i<str.length();i++) {
			
			if(candidate==str.charAt(i)-'0') {
				count++;
				if(count>=3) {
					return true;
				}
			}else {
				candidate=str.charAt(i)-'0';
				count=1;
			}
		}
		return false;
	}

}
