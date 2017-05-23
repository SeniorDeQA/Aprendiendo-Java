package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class PonUnTuit {
	
	protected static void tuitear() {
		
		// find Login 
		// By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
		// By.id("doc")
		
		CuatroEnUno.driver.manage().window().maximize();
		
		//DesiredCapabilities caps = DesiredCapabilities.firefox();
		//caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, true);

		CuatroEnUno.driver.findElement(By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")).click();
		CuatroEnUno.driver.findElement(By.xpath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("unbotcualquier1");
		CuatroEnUno.driver.findElement(By.xpath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("blabla");
		CuatroEnUno.driver.findElement(By.xpath("html/body/div[22]/div[2]/div[2]/div[2]/div[2]/form/input[1]")).click();
			
		CuatroEnUno.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		CuatroEnUno.driver.findElement(By.id("global-new-tweet-button")).click();
		CuatroEnUno.driver.findElement(By.xpath("html/body/div[10]/div[2]/div[2]/div[4]/form/div[2]/div[2]/div[2]/div[2]/div[1]")).sendKeys("Esto es una prueba");
		CuatroEnUno.driver.findElement(By.xpath("html/body/div[10]/div[2]/div[2]/div[4]/form/div[3]/div[2]/button")).click();
		
		//modalposttuiteo - se evita dejando un tuit
		//CuatroEnUno.driver.findElement(By.xpath("html/body/div[3]/div/div/a")).click();
		
		//borrar tuit
		CuatroEnUno.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		CuatroEnUno.driver.findElement(By.cssSelector(".ProfileTweet-actionButton.u-textUserColorHover.dropdown-toggle.js-dropdown-toggle"));
				//xpath("html/body/div[2]/div[2]/div/div[2]/div[4]/div[2]/ol[1]/li[1]/div[1]/div[2]/div[1]/div/div/button")).click();
		CuatroEnUno.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CuatroEnUno.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[2]/div[4]/div[2]/ol[1]/li[1]/div[1]/div[2]/div[1]/div/div/div/ul/li[7]/button")).click();
		CuatroEnUno.driver.findElement(By.cssSelector("btn.primary-btn.delete-action")).click();
		
		//logout
		CuatroEnUno.driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/div/div/div[3]/ul/li[1]/a")).click();
		CuatroEnUno.driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/div/div/div[3]/ul/li[1]/div/ul/li[12]/button")).click();
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//TODO hacer la prueba
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
	}//Fin ponerTuit

}//Fin PonUnTuit
