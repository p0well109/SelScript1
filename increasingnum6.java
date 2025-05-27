package selScripts;

import java.util.Scanner;

public class increasingnum6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number for rows and column : ");
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt(); 
		
		for(int i = 1, num2 = 1; i <= rows; i++, num2++ ) {
			for(int j = 1; j <= i; j++ ) {
			
				if(i % 2 == 0) {
				
					System.out.print(num2 + " ");
			
				}
				else	
					
					System.out.print("1 ");
				
			}
			
			System.out.println();
				
		}
		

	}

}
