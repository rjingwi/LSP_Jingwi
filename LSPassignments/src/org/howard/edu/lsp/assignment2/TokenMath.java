package org.howard.edu.lsp.assignment2;
import java.util.Scanner;

public class TokenMath {

	public static void main(String[] args) {
		boolean keepgoing = true;
		while (keepgoing == true){
			int sum = 0;
			int product = 1;
			System.out.println("String?");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (input.equals("Goodbye")) {
				keepgoing = false;
				scanner.close();
			}
			else{
				String[] tokens = input.split(" ");
				for(String i:tokens){
					sum += Integer.valueOf(i);
				}
				for(String i:tokens) {
					product = product*Integer.valueOf(i); 
				}
				
				System.out.println("Tokens:");
				for(String i:tokens) {
					System.out.println(i);
				}
				System.out.println("Sum: " + sum);				
				System.out.println("Product: "+ product);
			}
		}

	}
}
