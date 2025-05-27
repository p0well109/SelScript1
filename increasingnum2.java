package selScripts;

import java.util.Scanner;

public class increasingnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number for rows and column : ");
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt(); 
		
		for(int i = 1, rows2 = rows; i <= rows; i++, rows2-- ) {
			for(int j = 1; j <= i; j++ ) {
			
				System.out.print(rows2 + " ");
			}
			
			System.out.println();
				
		}

	}

}
