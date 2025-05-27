package selScripts;

import java.util.Scanner;

public class hillpattern1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//****************3 TRIANGLES - DECREASE,  INCREASE N RIGHT  TRIANGLE****************		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number decreasing triangle 3 : ");
		
		int rows = scanner.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			for( int j = i; j <= rows; j++) {
				
				System.out.print("  ");
								
			}
			//INSTEAD OF DEDUCTING 1 (MINUS 1) FOR THE 3RD FOR LOOP, REMOVE THE EQUAL SIGN FROM LESS THAN CHECKING
			for( int j = 1; j < i; j++) {
				
				System.out.print("* ");
								
			}
			
			for( int j = 1; j <= i; j++) {
				
				System.out.print("* ");
								
			}			
			
			System.out.println();
			
		}
		
		
		
	}

}