package selScripts;

import java.util.Scanner;

public class stringsArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many strings they want to enter
        System.out.print("How many strings do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        // Create an array to hold the strings
        String[] strings = new String[n];

        // Read strings from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Print the strings entered
        System.out.println("\nYou entered:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}