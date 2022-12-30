import java.util.Scanner;

public class Q10_advance {
	public static void main(String[]args) {
		
		// Q8 print Palindrome pattern (numbers appears same after rverse)
		/*
		 *       1
		 *      212
		 *     32123
		 *    4321234
		 *    
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Give row number");
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=rows;j++) {
				System.out.print(" ");
			}
			// 1 half numbers LHS of middle line including middleline
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			// 2nd half numbers RHS of middle line
			for(int j=2; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
