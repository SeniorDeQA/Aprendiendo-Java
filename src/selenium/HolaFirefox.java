package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HolaFirefox {
	
	public static void main(String[] args) {
		WebDriver driver;
		
		//Se inicializa pasando por Gecko
		System.setProperty("webdriver.gecko.driver", "C://Users//dortiz//workspace//selenium_3.4.0//geckodriver.exe");
		
		
		driver =new FirefoxDriver();
		//debe ser url formal
		String baseURL = "http://www.google.com";
			
		driver.get(baseURL);
	}
	


}
