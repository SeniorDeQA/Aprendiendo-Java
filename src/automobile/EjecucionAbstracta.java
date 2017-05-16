package automobile;

public class EjecucionAbstracta {

	public static void main(String[] args) {
		
		BMWAbstracto bmwf = new BMWAbstracto();
		bmwf.engineStart("Por huella digital", 200);
		
		//CocheAbstracto cf = new CocheAbstracto();
		//bmwf.engineStart("Por huella digital", 200);
		//Parece que pide instanciar el coche abstracto, pero como tiene abstract no puede ser instanciado
		
		//Se debe instanciar la clase (BMWabstracto, que no es abstracto) que extiende de la abstracta (CocheAbstracto)
		
		bmwf.setPrivateSpeed(100);
		bmwf.setPublicSpeed(200);
		bmwf.setProtectedSpeed(300);
		bmwf.setSpeedLimit(400);
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Tras usar los setters del BMW, heredados o implementados/sobreescritos, los valores quedan");
		//System.out.println("PrivateSpeed: "+bmwf.privateSpeed);
		//Private, solo desde la misma clase, no se puede
		//Al setear tampoco deberíamos haber podido, pero hemos pasado tb por un setter public para tocar la variable private
		//Usamos el getter que le hemos hecho
		System.out.println("PrivateSpeed: "+bmwf.getPrivateSpeed());
		System.out.println("PublicSpeed: "+bmwf.publicSpeed);
		System.out.println("ProtectedSpeed: "+bmwf.protectedSpeed);
		System.out.println("SpeedLimit: "+bmwf.speedLimit);
		
	}

}
