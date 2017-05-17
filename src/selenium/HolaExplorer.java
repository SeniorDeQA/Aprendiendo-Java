package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class HolaExplorer {
	
	static final String RUTA_SELENIUM = "C://Users//dortiz//workspace//selenium_3.4.0";
	
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver", RUTA_SELENIUM+"//iedriver.exe");
		
		driver =new InternetExplorerDriver();
		String baseURL = "http://www.google.com";
			
		driver.get(baseURL);
	}
	


}
