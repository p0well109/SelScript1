package selScripts;

import java.util.Scanner;

public class stringArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner varStrings = new Scanner(System.in);
		
		// Ask the user how many strings they want to enter
		System.out.print("Enter the number of food you want : ");
		
		int varLetterString = varStrings.nextInt();
		varStrings.nextLine();     // consume newline character or for scanner - clear the input buffer for this line of code	
		
        // Create an array to hold the strings
		String [] inputStrings = new String[varLetterString];

		
		//INPUT FOR THE RECORD OR DATA THAT HAS BEEN KEYED IN OR PROVIDED WILL STORE OR SAVED IN MEMORY
		for(int i = 0; i < inputStrings.length; i++) {
			
			System.out.print("Enter a food : ");
			inputStrings[i] = varStrings.nextLine();
		
		}
		
		//PRINT THE VALUES FROM THE INPUT(PREVIOUS FOR LOOP)
		for(String words : inputStrings) {
			
			System.out.print(words + " ");
			
		}
		
		varStrings.close();
		
	}
	
}
