package sueltos;

import java.util.Scanner;



public class argsConInput {
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Mete cadena: ");
		String original = scan.nextLine();
	
	
			while (original.isEmpty() || original == null) {
				System.out.println("No metas ni nulos ni vacios, cutre:");
				original = scan.nextLine();
			}
	
			scan.close();
			String[] originalSplit = original.split("\\s+");
	
			for (String item : originalSplit) { 
		
				if (item.compareTo("david")==0) {
					System.out.println("A ese le conozco");
				} else {
					
					System.out.println(item);
				}
			
			
		
			}
	
	
	}
	
}	
	

