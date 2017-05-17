package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HolaChrome {
	
	public static void main(String[] args) {
		
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://Users//dortiz//workspace//selenium_3.4.0//chromedriver.exe");
		
		driver = new ChromeDriver() ;				
		
		driver.get(baseURL);
	
		
	}
	


}



