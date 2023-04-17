package base;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import utilities.Utility;
public class Baseclass extends Utility{
	
	@BeforeMethod
	public void Startup() throws IOException {
		driver=initilizDriver();
		driver.get(prop.getProperty("url"));
			
	}
	
	@AfterMethod
	public void close() {
		
		driver.quit();
		
	}
}
 

