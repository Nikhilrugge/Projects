package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
			
	}
      //Locate element
	@FindBy(xpath="(//div[@class=css-76zvg2 r-jwli3a r-ubezar])[1]")
	 WebElement loginkey;
	
	@FindBy(xpath="(//div[@class=css-76zvg2 r-homxoj r-ubezar r-1ozqkpa])[4]")
	WebElement emailbutton;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement enteremailid;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterpassword;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterinvalidepassword;
	
	@FindBy(xpath="//div[@data-testid='login-submit-btn']")	
	WebElement loginbutton;
	
	//Method Creation
	public void login(){
		loginkey.click();
	}
	
	 public void emailbutton() {
		 emailbutton.click();  
    }
	 
	 public void EmailId(String Email) {
		 enteremailid.sendKeys(Email);
	 }
	 
	 public void Password(String Password) {
		 enterpassword.sendKeys(Password);
	 }
	 
	 public void invalidePassword(String InvalidePassword) {
		 enterpassword.sendKeys(InvalidePassword);
	 }
	public void LoginButton() {
		loginbutton.click();
	}
}
