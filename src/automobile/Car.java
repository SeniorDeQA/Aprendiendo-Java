package automobile;


public class Car {
	//Solo desde la misma clase
	private String make;
	//No modifier, accesible in the same package
	int speed;
	//NO desde otros paquetes
	protected int protectedSpeed;
	int speedLimit = 300 ;
	int gear;
	
	
	//CONSTRUCTORES
	public Car() {
		this(99,5,99);
		//constructor debe ir primero. 
		System.out.println("Executing constructor without arguments. Assume default values.");
	}
	
	public Car(int speed, int gear, int protectedSpeed) {

		if (speed < speedLimit) {
			this.speed = speed;
		}
		this.gear = gear;
		if (protectedSpeed <300) {
			this.protectedSpeed = protectedSpeed;
		}
		System.out.println("Executing constructor with 3 arguments");
	}
	
	public Car(int speed, int gear, int protectedSpeed, String make) {

		if (speed < speedLimit) {
			this.speed = speed;
		}
		this.gear = gear;
		this.make = make;
		if (protectedSpeed < speedLimit) {
			this.protectedSpeed = protectedSpeed;
		}
		System.out.println("Executing constructor with 4 arguments");
	}
	
	public Car(int speed, int gear) {

		if (speed < speedLimit) {
			this.speed = speed;
		}
		this.gear = gear;
		
		System.out.println("Executing constructor with 2 arguments: speed & gear");
	}
	
	public Car(int gear) {

		this.gear = gear;		
		System.out.println("Executing constructor with 1 argument. Assume gear.");
	}
	
	
	//SETTERS
	
	// "this" refers to the instance of the class (object)
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setProtectedSpeed(int pSpeed) {
		if (pSpeed < speedLimit) {
			this.protectedSpeed = pSpeed;
		} else {
			System.out.println("La velocidad no es aceptable para el coche. Se obvia. La dejamos en " + this.getSpeed());
		} //Es protected pero ofrecemos un set para alterarla
	}
	
	public void setSpeed(int speed) {
		if (speed < speedLimit) {
			this.speed = speed;
		} else {
			System.out.println("La velocidad no es aceptable. Se obvia. La dejamos en " + this.getSpeed());
		}
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
	//GETTERS
	
	public String getMake() {
		System.out.println("Fabricante " + make);
		return make;
	}
	
	public int getSpeed() {
		System.out.println("Velocidad actual: " + speed);
		return speed;
	}
	
	public int getProtectedSpeed() {
		System.out.println("Velocidad máxima: " + protectedSpeed);
		return protectedSpeed;
	}
	
	public int getGear() {
		System.out.println("Marchas: "+ gear);
		return gear;
	}	
	
	
	
	//MÉTODOS
	
	public void increaseSpeed() {		
		
		if (speed < speedLimit) {
			System.out.println("Increasing Speed of Car");
			speed++;
			
			
		} else {
			System.out.println("La velocidad no es aceptable para el Coche. Se obvia");
			
		}
		
	}
	
	public void acelerar(int hasta){
		if (speed < speedLimit) {
			System.out.println("Acelerando SOLO hasta " + speedLimit);
			speed=speedLimit;
			
		} else {
			System.out.println("Acelerando hasta " + hasta);
			speed=hasta;
		}
		
	}
	
	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Car");
	}
	
	
}


