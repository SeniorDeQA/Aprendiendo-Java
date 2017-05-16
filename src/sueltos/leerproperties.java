package sueltos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class leerproperties {

    public static void main(String[] args) throws IOException {
    	try {
            String path = "C:/Users/dortiz/workspace/Ejercicios/ejemplo.properties";
            Properties prop = new Properties();
            FileInputStream fs = new FileInputStream(path);
            prop.load(fs);
            System.out.println(prop.getProperty("name"));
            System.out.println(prop.getProperty("course"));
    	} catch (Exception e) {
    		e.printStackTrace();
    		System.out.println("Algo ha fallado con el fichero. Debe existir y ser un properties");
    		//System.out.close();
    	}
    }


}
