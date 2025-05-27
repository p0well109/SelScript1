package selScripts;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner arraynumber = new Scanner(System.in);
		
		System.out.println("Enter your desire number!");
		
		int n = arraynumber.nextInt();
		
		System.out.println("You are entering " + n + " numbers!" );	

		int [] arr = new int [n];
		
		
		//INPUT FOR THE RECORD OR DATA THAT HAS BEEN KEYED IN OR PROVIDED WILL STORE OR SAVED IN MEMORY
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = arraynumber.nextInt();
		

		}
		//PRINT THE VALUES FROM THE INPUT(previous for loop)
		for(int i = 0; i < arr.length; i++) {
			
		
			System.out.print(arr[i] + " ");	
			
		}
	
		
		
		
	}

}
