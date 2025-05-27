package selScripts;

import java.util.Scanner;

public class numbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int varSum  = 0;
		int varProduct = 1;
		double sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your desire number!" );	
		int n = scanner.nextInt();

		for(int i = 1; i <= n; i++) {
			
			sum = sum + ((1.0/i * 2));
			
		}
		
		System.out.println("Sum is " + sum );	


	
		
	}

}
