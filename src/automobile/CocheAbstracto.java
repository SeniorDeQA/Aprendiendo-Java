package automobile;

	public abstract class CocheAbstracto {
		
		private int privateSpeed;
		public int publicSpeed;
		protected int protectedSpeed;
		
		int speedLimit = 100 ;
		
		public CocheAbstracto () {
			this(0);
			System.out.println("Comprobamos que this refiere al constructor. Pasamos this 0 y privateSpeed vale " + privateSpeed);
			System.out.println("BMWAbstracto hereda de CocheAbstracto y setea su speedLimit de 100 con valor " +speedLimit);
		}
		
		public CocheAbstracto (int startSpeed) {
			//Constructor un param, mete en private speed
			//Ver que el constructor sin param hace this 0, con lo que o creamos pasando privatespeed, o le meterá 0. 
			this.privateSpeed = startSpeed;
		}
		
		public void setPrivateSpeed(int pSpeed) {
			this.privateSpeed = pSpeed;
		}
		//Le hacemos un getter por ser private, solo tocable desde la misma clase
		public int getPrivateSpeed() {
			return this.privateSpeed;
		}
		public void setPublicSpeed(int pSpeed) {
			this.publicSpeed = pSpeed;
		}
		public void setProtectedSpeed(int pSpeed) {
			this.protectedSpeed = pSpeed;
		}
		
		public abstract void engineStart(String keyType, int numOfCyl);
		
		public abstract void setSpeedLimit(int pSpeed);
		
		
		
		
		
		
		
	}


