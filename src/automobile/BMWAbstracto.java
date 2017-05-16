package automobile;

public class BMWAbstracto extends CocheAbstracto{

		
		public void setPrivateSpeed(int speed) {
			super.setPrivateSpeed(speed);
		}	
		
		
		//2 métodos abstract en la clase madre, deben ser implementados/sobreescritos en la hija 
		@Override
		public void engineStart(String keyType, int numOfCyl) {
			System.out.println("This is the BMW engine start");
			System.out.println("Every child class may have different implementation");
			System.out.println("BMWAbstracto sobreescribe el método de arrancar del cocheAbstracto. En esta ejecución le has pasado Tipo de llave " +keyType+ " y cilindros " +numOfCyl);
		}

		@Override
		public void setSpeedLimit(int pSpeed) {
			this.speedLimit = pSpeed;
			
		}
		
		
		
		
		
		
	
}
	
	
