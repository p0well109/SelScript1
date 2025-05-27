package selScripts;

import java.util.Scanner;

public class increasingnum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number decreasing triangle 3 : ");
		
		int rows = scanner.nextInt();
		
		for(int i = 1, rows21 = 1; i <= rows; i++, rows21++) {
			for( int j = i; j <= rows; j++) {
				
				System.out.print("  ");
								
			}
			//INSTEAD OF DEDUCTING 1 (MINUS 1) FOR THE 3RD FOR LOOP, REMOVE THE EQUAL SIGN FROM LESS THAN CHECKING
			for( int j = 1; j < i; j++) {
				
				System.out.print(rows21 + " ");
								
			}
			
			for( int j = 1; j <= i; j++) {
				
				System.out.print(rows21 + " ");
								
			}			
			
			System.out.println();
			
		}
		
	}

}
