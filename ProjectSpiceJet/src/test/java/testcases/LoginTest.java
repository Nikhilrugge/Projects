package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageObjects.LogInPage;



public class LoginTest extends Baseclass{


	@Test(priority=1)
	public void LoginWithValideCredentials() {
		LogInPage login=new LogInPage(driver);
		login.login();
		login.emailbutton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.LoginButton();	
	}
	
	
	@Test(priority=2)
	public void LoginWithInValideCredientils() {
		LogInPage login=new LogInPage(driver);
		login.login();
		login.emailbutton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidePassword"));
		login.LoginButton();	
	}
}
