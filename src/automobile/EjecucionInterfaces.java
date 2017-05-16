package automobile;

public class EjecucionInterfaces {

		public static void main(String[] args) {
			//una interface de tipo coche instanciada ¿con? una clase de tipo prueba (que implementa coche y bmw)
			//puede leerse como que pasamos la clase prueba, para completar la interfaz coche
		
			InterfazCoche myInterface = new PruebaInterfaces();
			myInterface.engineStart("6 Cyl", true);
			//myInterface.headsUpNavigation(); No se puede usar 
			//estamos "completando" el metodo headsUpNavigation, pero coche no lo tiene, es de BMW, por lo que se pierde
			//Si coge ambas seria herencia multiple
			
			InterfazBmw my2Interface = new PruebaInterfaces();
			my2Interface.headsUpNavigation();
			
			//Tp se pueden instanciar interfaces, por ser interfaces
			//InterfazBmw my3Interface = new InterfazBmw();
			//my3Interface.headsUpNavigation();
			
			PruebaInterfaces my4Interface = new PruebaInterfaces();
			my4Interface.headsUpNavigation();
			//Pero si podemos isntanciar la clase que implementa ambas interfaces
			//Y aqui SI que tenemos disponibles los metodos de ambas
			my4Interface.engineStart("850 caballos", false);
			
			
		}

}


		
		
