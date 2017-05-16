package automobile;

public class BMW extends Car {
	
	public BMW (int BMW){
		super(BMW);
		System.out.println("Construimos un BMW");
		
	}

	@Override
	public void increaseSpeed() {
		
		if (speed < speedLimit) {
			System.out.println("Increasing Speed of BMW");
			speed++;
	
			
		} else {
			System.out.println("La velocidad no es aceptable para el BMW. Se obvia. La dejamos en " + this.getSpeed());
		}
		
	}
	
	public void autoconduccion() {
		System.out.println("BMW Specific Functionality. Se conduce solo");
	}
	
	

	public void stop() {
	int a=this.getSpeed();	
		for (int i = a; i > 0; i=i-1){
			System.out.println(i);
		}
		this.speed=0;
		System.out.println("Frenada en seco");
	}
	
	
	
	
	
}
