package automobile;

public class BMWAbstracto extends CocheAbstracto{

		
		public void setPrivateSpeed(int speed) {
			super.setPrivateSpeed(speed);
		}	
		
		
		//2 m�todos abstract en la clase madre, deben ser implementados/sobreescritos en la hija 
		@Override
		public void engineStart(String keyType, int numOfCyl) {
			System.out.println("This is the BMW engine start");
			System.out.println("Every child class may have different implementation");
			System.out.println("BMWAbstracto sobreescribe el m�todo de arrancar del cocheAbstracto. En esta ejecuci�n le has pasado Tipo de llave " +keyType+ " y cilindros " +numOfCyl);
		}

		@Override
		public void setSpeedLimit(int pSpeed) {
			this.speedLimit = pSpeed;
			
		}
		
		
		
		
		
		
	
}
	
	
