package testcases;

import org.testng.annotations.Test;
import base.Baseclass;
import pageObjects.RoundTripPage;

public class RoundTripTest extends Baseclass {
	
	@Test
	public void SearchFlight() {
		RoundTripPage roundtrip=new RoundTripPage(driver);
		roundtrip.RoundTripButton();
		roundtrip.From(prop.getProperty("From"));
		roundtrip.To(prop.getProperty("to"));
		roundtrip.DepartureDate();
		roundtrip.ReturnDate();
		roundtrip.SearchFlight();

	
   }
	
}
