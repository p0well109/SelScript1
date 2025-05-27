package selScripts;

import java.util.Scanner;

public class trianglepat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//****************RIGHT TRIANGLE SAMPLE 2, start at 1 for i and j var****************
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number : ");
		
		int rows = scanner.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				
				System.out.print("* ");
							
			}
			
			System.out.println();	
			
		}
		

	}

}
