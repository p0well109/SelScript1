package selScripts;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Scanner arraynumber = new Scanner(System.in);
		
		System.out.println("Enter the number of integer you prefer ");
		
		int n = arraynumber.nextInt();
		
		System.out.println("You are entering " + n + " numbers!" );	

		int [] arr = new int [n];
		
		
		//INPUT FOR THE RECORD OR DATA THAT HAS BEEN KEYED IN OR PROVIDED WILL STORE OR SAVED IN MEMORY
		for(int i = 0;i < arr.length; i++ ) {
			
			arr[i] = arraynumber.nextInt();
			
			
		}
		
		//ENHANCED FOR LOOP : DIRECTLY PRINTING THE ARRAY PROVIDED
		for(int num : arr) {              // for every element in the array. print the element.
			System.out.println(num);      // num represents element of the array.
						
			
		}
		
		
		

	}

}
