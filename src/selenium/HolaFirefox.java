package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Firefox va por gecko, hay que importarlo. 


public class HolaFirefox {
	
	static final String RUTA_SELENIUM = "C://Users//dortiz//workspace//selenium_3.4.0";
	
	public static void main(String[] args) {
		WebDriver driver;
		
		//Se inicializa pasando por Gecko
		System.setProperty("webdriver.gecko.driver", RUTA_SELENIUM+"//geckodriver.exe");
		
		driver =new FirefoxDriver();
		//debe ser url formal
		String baseURL = "http://www.google.com";
			
		driver.get(baseURL);
	}
	


}
