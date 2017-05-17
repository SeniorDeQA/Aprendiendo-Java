package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HolaChrome {
	
	static final String RUTA_SELENIUM = "C://Users//dortiz//workspace//selenium_3.4.0";
	
	public static void main(String[] args) {
		
		
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", RUTA_SELENIUM+"//chromedriver.exe");
		
		driver = new ChromeDriver() ;				
		
		driver.get(baseURL);
	
		
	}
	


}



