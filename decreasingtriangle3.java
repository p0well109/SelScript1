package selScripts;

import java.util.Scanner;

public class decreasingtriangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//****************2 TRIANGLES - INCREASE AND VERTICAL TRIANGLE****************		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number decreasing triangle 3 : ");
		
		int rows = scanner.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			for( int j= 1; j <= i; j++) {
				
				System.out.print("  ");
								
			}
			
			for( int j = i; j <= rows; j++) {
				
				System.out.print("* ");
								
			}
			
			System.out.println();
			
		}
		

	}

}
