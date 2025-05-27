package selScripts;

import java.util.Scanner;

public class decreasingtriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//****************DECREASE RIGHT TRIANGLE****************

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number : ");
		
		int rows = scanner.nextInt();
		
		for(int i = 0; i < rows; i++) {
			for(int j = i; j < rows; j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}		
		
		
	}

}
