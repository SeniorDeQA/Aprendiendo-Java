package selenium;

import org.openqa.selenium.By;


public class PonUnTuit {
	
	public static void ponerTuit(){
		
		// find Login 
		// By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
		// By.id("doc")
		
		CuatroEnUno.driver.manage().window().maximize();
		
		if (CuatroEnUno.driver.findElement(By.id("doc")) != null ) {
			
			System.out.println("Bien");
			
			//TODO hacer la prueba
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} else {
			System.out.println("El botón no ta");
		}
		
	}
	

}
