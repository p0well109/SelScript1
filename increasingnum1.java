package selScripts;

import java.util.Scanner;

import org.checkerframework.common.value.qual.EnumVal;

public class increasingnum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number for rows and column : ");
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt(); 
		
		for(int i = 1, num2 = 1; i <= rows; i++, num2++ ) {
			for(int j = 1; j <= i; j++ ) {
			
				System.out.print(num2 + " ");
			}
			
			System.out.println();
				
		}
		

	}

}
