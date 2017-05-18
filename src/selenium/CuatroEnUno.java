package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.PonUnTuit;


public class CuatroEnUno {
	
	static final String RUTA_SELENIUM = "C://Users//dortiz//workspace//selenium_3.4.0";
	static WebDriver driver; 
	
	public static void Pruebas(String QueNavegador){
		//Baterías de pruebas, abstraida de navegador
		
		PonUnTuit.ponerTuit();
		
		
		
		
		driver.quit();
		System.out.println("FIN PRUEBAS en "+QueNavegador);
	}
	
	
	
	public static void Lanzador(int Case){
		//Lanzamos los navegadores, y pasamos a la prueba
		String baseURL = "https://twitter.com/";	
		String QueNavegador;
		
		switch (Case) {
	     case (1)://Edge
	    	System.setProperty("webdriver.edge.driver", RUTA_SELENIUM+"//edgedriver.exe");
		 	driver = new EdgeDriver();
		 	driver.get(baseURL);
		 	QueNavegador = "Edge";
		 	Pruebas(QueNavegador);
	 		break; 
	     case (2)://IE
	 		System.setProperty("webdriver.ie.driver", RUTA_SELENIUM+"//iedriver.exe");
			driver =new InternetExplorerDriver();
		    driver.get(baseURL);
		    QueNavegador = "IE";
		 	Pruebas(QueNavegador);
			break;
	     case (3)://Chrome
	 		System.setProperty("webdriver.chrome.driver", RUTA_SELENIUM+"//chromedriver.exe");
			driver = new ChromeDriver() ;		
		    driver.get(baseURL);
		    QueNavegador = "Chrome";
		 	Pruebas(QueNavegador);
		 	break; 
	     case (4)://Firefox
	 		System.setProperty("webdriver.gecko.driver", RUTA_SELENIUM+"//geckodriver.exe");
			driver =new FirefoxDriver();
			driver.get(baseURL);
			QueNavegador = "Firefox";
		 	Pruebas(QueNavegador);
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
