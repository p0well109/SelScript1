package selScripts;

import java.util.Scanner;

public class increasingnum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number reverse triangle 4 : ");
		
		int rows = scanner.nextInt();
		
		for(int i = 1, num = 1; i <= rows; i++, num++) {
			for( int j = 1; j <= i; j++) {
				
				System.out.print("  ");
								
			}
			//MAKE THIS LESS THAN ONLY WITHOUT THE EQUAL TO SIGN WHEN CHECKING FOR ROWS
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
