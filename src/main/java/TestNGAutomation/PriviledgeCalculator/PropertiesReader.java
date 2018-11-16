package TestNGAutomation.PriviledgeCalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	 public Properties getProperty() throws IOException {
		 FileReader f1= new FileReader("SeleniumProperties.properties");
		 BufferedReader reader=new BufferedReader(f1);
		 Properties p=new Properties();
		 p.load(reader);
		 
		 return p;
	 }
}
