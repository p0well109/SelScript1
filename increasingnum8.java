package selScripts;

import java.util.Scanner;

public class increasingnum8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number reverse triangle 4 : ");
		
		int rows = scanner.nextInt();
		
		//FOR DIAMOND PATTERN ---- REMOVE THE EQUAL TO SIGN IN THE FIRST FOR LOOP WHEN CHECKING WITH ROWS
		for(int i = 1, num = 1; i < rows; i++, num++) {
			for( int j = i; j <= rows; j++) {
				
				System.out.print("  ");
								
			}
			 
			for( int j = 1; j < i; j++) {
				
				System.out.print(num + " ");
								
			}
			
			for( int j = 1; j <= i; j++) {
				
				System.out.print(num + " ");
								
			}
			
			System.out.println();
		
		}
		
		for(int i = 1, num = 1; i <= rows; i++, num++) {
			for( int j = 1; j <= i; j++) {
				
				System.out.print("  ");
								
			}
			 
			for( int j = i; j < rows; j++) {
				
				System.out.print(num + " ");
								
			}
			
			for( int j = i; j <= rows; j++) {
				
				System.out.print(num + " ");
								
			}
			
			System.out.println();
		
		}


	}

}
