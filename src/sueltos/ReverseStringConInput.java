package sueltos;


import java.util.Scanner;

public class ReverseStringConInput {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String original = scan.nextLine();
		
		while (original.isEmpty() || original == null) {
			System.out.println("Please enter a valid string, empty and null strings are not accepted:");
			original = scan.nextLine();
		}
		scan.close();
		
		ReverseStringConInput output = new ReverseStringConInput();
		String reverseCharacters = output.reverseCharacters(original);
		System.out.println(reverseCharacters);
	}
	
	private String reverseCharacters(String originalString) {
		String reverse = "";
		
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reverse = reverse + originalString.charAt(i);
		}
		return reverse;
	}
}
