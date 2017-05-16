package automobile;


public class PruebaInterfaces implements InterfazCoche, InterfazBmw {
	//Esta clase implementa 2 interfaces, ok, pero NO ES interfaz

		@Override
		public void engineStart(String engineType, boolean isKeyLess) {
			System.out.println("This is the implementation of engineStart. Implementada en prueba, prototipada de Coche, requiere una instancia de interfaz Coche");
			System.out.println("Me has pasado "+engineType+" y "+isKeyLess);
			
		}

		@Override
		public void headsUpNavigation() {
			System.out.println("This is the implementation of headsup navigation. Implementada en prueba, prototipada de BMW, requiere una instancia de interfaz BMW");
		}
	

}
