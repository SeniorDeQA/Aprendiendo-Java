package sueltos;


public class ReverseString {
	
	public static void main(String[] args) {
		String input = "this is a test string";
		String output = reverse(input);
		System.out.println(output);
	}
	
	// There is no built-in reverse method for strings in Java
	// There is one with String Builder, which does not give the output we want
	private static String reverse(String input) {
		String reverse = "";
		
		if (input.isEmpty() || input == null) {
			System.out.println("Empty and null strings are not accepted");
		}
		
		if (input.length() <= 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			
			//System.out.println(originalArray); no va a funcionar contra array de strings
			//La forma de tracear el array de string es 
			//for (int i=0; i<=5; i++){
			//	System.out.println(originalArray[i]);
			//}
			//Y veremos que en cada pos del array hay un array, partido gracias al split.
			
			//Pero la cosa es tenerlo en una línea
			
			//Item refiere a cada tal, en un array
			//En este caso el array es de strings, claro
			//Deestos item : aquí
			
			for (String item : originalArray) { // this, is, a, test, string
				reverse = item + " " + reverse; // this + "", is + this, a + is this, test + a is this, string + test a is this
				//System.out.println(reverse); //traza
			}
		}
		
		return reverse.trim();
	}
}