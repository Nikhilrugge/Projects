package testcases;

import org.testng.annotations.Test;
import base.Baseclass;
import pageObjects.SignUpPage;

public class SignUpTest extends Baseclass{
	
	@Test
	public void SignUp() {
		SignUpPage signup=new SignUpPage(driver);
		signup.SignUp();
		signup.SelectTitle();
		signup.FirstName(prop.getProperty("FirstName"));
		signup.LastName(prop.getProperty("LastName"));
		signup.EnterCountry(prop.getProperty("Country"));
		signup.DateOfBirth(prop.getProperty("DOB"));
		signup.Mobilenumber(prop.getProperty("MobileNumber"));
		signup.Emailid(prop.getProperty("EmailId"));
		signup.EnterPassword(prop.getProperty("Password"));
		signup.ConfermPassword(prop.getProperty("ConfermPassword"));
		signup.AgreementCheck();
		signup.SignupButton();
		
	
		
	
	
	}
	
}
