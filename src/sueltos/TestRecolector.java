package sueltos;

import java.sql.Date;

public class TestRecolector {
	
	@SuppressWarnings("deprecation")
	public void testear(){
        Date fecha = null;
        for (int i = 0;i<999999999;i++){
        		fecha = new Date(2011,8,7);
        		fecha = null;
        	}
   }

	
	
	public void pasarGarbageCollector(){
		 
		   Runtime garbage = Runtime.getRuntime();
		   System.out.println("Memoria libre antes de limpieza:"+ garbage.freeMemory());
		 
		   garbage.gc();
		 
		   System.out.println("Memoria libre tras la limpieza:"+ garbage.freeMemory());
	}

	
}
