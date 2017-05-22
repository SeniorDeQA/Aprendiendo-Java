package selenium;

import org.openqa.selenium.By;


public class PonUnTuit {
	
	protected static void tuitear() {
		
		// find Login 
		// By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
		// By.id("doc")
		
		CuatroEnUno.driver.manage().window().maximize();
		
		try {
			CuatroEnUno.driver.findElement(By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")).click();
			CuatroEnUno.driver.findElement(By.xpath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("seniordeqa");
			CuatroEnUno.driver.findElement(By.xpath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("moravia");
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[22]/div[2]/div[2]/div[2]/div[2]/form/input[1]")).click();
			
			
			
		} catch (Exception e){
		  System.out.println(e.getStackTrace());	
		} 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//TODO hacer la prueba
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
	}//Fin ponerTuit

}//Fin PonUnTuit
