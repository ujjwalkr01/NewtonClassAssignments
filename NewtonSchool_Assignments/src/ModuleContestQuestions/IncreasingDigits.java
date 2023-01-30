package ModuleContestQuestions;

import java.util.Scanner;

public class IncreasingDigits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(i<10) {
				count++; 
			} 
			else {
				if(satisfyingOrder(i)) {
					count++;
				}
			}
		}
		System.out.println(count);

	} 
 
	private static boolean satisfyingOrder(int i) {

		int curr_digit=i; 
		boolean IsinOrder=false;
		
		while(i!=0) {
			int rem=i%10; 
			i/=10; 
			
			if(rem<curr_digit) { 
				curr_digit=rem; 
				IsinOrder=true; 
			}else {
				return false;
			}
		}
		return IsinOrder;
	}

}
