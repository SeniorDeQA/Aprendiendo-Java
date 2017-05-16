package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		String baseURL = "https://letskodeit.teachable.com/pages/practice";
		
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.MAC);//puta mentira
		
		
		//Se inicializa pasando por Gecko
		System.setProperty("webdriver.gecko.driver", "C://Users//dortiz//workspace//selenium_3.4.0//geckodriver.exe");
		driver = new FirefoxDriver(caps);//lo seteo pasando capabilities
		
		//controlo la marioneta
		//https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
}