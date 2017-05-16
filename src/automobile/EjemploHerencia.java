package automobile;
import automobile.BMW;
import automobile.Car;

public class EjemploHerencia {

	public static void main(String[] args) {
		

		BMW c1 = new BMW(5);
		c1.increaseSpeed();
		c1.acelerar(400);
		c1.setMake("BMW de Alcorcón");
		c1.getSpeed();
		c1.setProtectedSpeed(250);
		c1.getGear();
		c1.getMake();
		c1.getProtectedSpeed();
		//c1.autoconduccion();
		//c1.stop();
		
		//Car c2 = new Car(400);
		//c2.increaseSpeed();
		
		
	}

}
