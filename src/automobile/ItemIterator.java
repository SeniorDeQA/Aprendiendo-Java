package automobile;

public class ItemIterator {

	public static void main(String[] args) {
		String input = "this is a test string";
		String[] originalArray = input.split("\\s+");//Potente, cortar un texto por espacios y almacenarlo en un array de strings
		String output = "";
		
		for (int i=0; i<=4; i++){
			System.out.println(originalArray[i]);
			//La primera iteración le insertaría un espacio
			if (i==0) {
				output = originalArray[i];
				} else {
					output = output + " " + originalArray[i];
				}
					
			}
		
		System.out.println(output);
		output = ""; //limpiamos para reejecutar
		
		//Mas potente, iterar en un Array por cada item de tipo que sea
		System.out.println("---------------------Ahora con item iterator------------------");
		
		int i = 0;
		for (String item : originalArray) { 
			System.out.println("El palabro ahora es: " + item);
			i = ++i; //¡¡OJO!!!, i = i++ primero usa y luego suma, o haces i = ++i, o solo i++. 
			//La primera iteración le insertará un espacio
			if (i == 1) {
				output = item;
			} else {
				output = output + " " + item;
			}		
			
		}
		
		System.out.println(output);
		
	}

}
