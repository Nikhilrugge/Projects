package testcases;
import org.testng.annotations.Test;
import base.Baseclass;
import pageObjects.OnewayTripPage;



public class OnewayTripTest extends Baseclass {

	@Test
	public void SearchFlight() {
		OnewayTripPage onetrip=new 	OnewayTripPage(driver);
		onetrip.OnewayTripButton();
		onetrip.From(prop.getProperty("From"));
		onetrip.To(prop.getProperty("to"));
		onetrip.DepartureDate();
		onetrip.ReturnDate();
		onetrip.SearchFlight();

		
		
	}
	
}
