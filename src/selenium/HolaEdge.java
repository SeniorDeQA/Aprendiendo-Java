package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class HolaEdge {
	
	static final String RUTA_SELENIUM = "C://Users//dortiz//workspace//selenium_3.4.0";
	
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.edge.driver", RUTA_SELENIUM+"//edgedriver.exe");
		
		driver = new EdgeDriver();
		String baseURL = "http://www.google.com";
			
		driver.get(baseURL);
	}
	


}
