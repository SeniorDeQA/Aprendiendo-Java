package sueltos;


public class ConcatenarStrings {

	public static void main(String[] args) {
		// String Literal - String Constant Pool
		String str1 = "Hello";
		
		// String Object - Heap
		String str2 = new String("Welcome");
		
		// Strings
		
		str1 = "More Hello";
		
		String stradd = str1 + str2;
		
		
		System.out.println(stradd);
	}
	
		
	
}
