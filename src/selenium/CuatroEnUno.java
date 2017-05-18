package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CuatroEnUno {
	
	static final String RUTA_SELENIUM = "C://Users//dortiz//workspace//selenium_3.4.0";
	static WebDriver driver; 
	
	public static void Prueba(){
		//Ejecutamos la prueba
		/**
		 * Firefox peta con el quit
		 * IE no reacciona al close
		 */
		driver.close();
		//TODO hacer algo
		System.out.println("Estatobien");
	}
	
	
	
	public static void Lanzador(int Case){
		//Lanzamos los navegadores, y pasamos a la prueba
		String baseURL = "http://www.google.com";	
		
		switch (Case) {
	     case (1)://Edge
	    	System.setProperty("webdriver.edge.driver", RUTA_SELENIUM+"//edgedriver.exe");
		 	driver = new EdgeDriver();
		 	driver.get(baseURL);
		 	Prueba();
	 		break; 
	     case (2)://IE
	 		System.setProperty("webdriver.ie.driver", RUTA_SELENIUM+"//iedriver.exe");
			driver =new InternetExplorerDriver();
		    driver.get(baseURL);
		    Prueba();
			break;
	     case (3)://Chrome
	 		System.setProperty("webdriver.chrome.driver", RUTA_SELENIUM+"//chromedriver.exe");
			driver = new ChromeDriver() ;		
		    driver.get(baseURL);
		    Prueba();
			break; 
	     case (4)://Firefox
	 		System.setProperty("webdriver.gecko.driver", RUTA_SELENIUM+"//geckodriver.exe");
			driver =new FirefoxDriver();
			driver.get(baseURL);
			Prueba();
	    	break; 		    		
		}	
				 
	}//FIN LANZADOR
	
	
	
	
	public static void main(String[] args) {
		
		//Solo iteramos para trabajar con 4 navegadores
		//Pasamos a Lanzador
		for (int i=1; i<=4; i++){
			
			switch (i) {
		     case (1)://Edge
		 	    Lanzador(1);
		 		break; 
		     case (2)://IE
		    	Lanzador(2);
				break;
		     case (3)://Chrome
		    	Lanzador(3);
				break; 
		     case (4)://Firefox
		    	Lanzador(4);
		    	break; 		    		
			}	
			
		}//FIN FOR
		
	}//FIN MAIN

	

}
