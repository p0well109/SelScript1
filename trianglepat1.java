package selScripts;

import java.util.Scanner;

public class trianglepat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//****************RIGHT TRIANGLE****************
		
		//int rows;
		
		System.out.println("Enter the number of rows : " );	
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j <= i; j++ ) {
				
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		


	}

}
