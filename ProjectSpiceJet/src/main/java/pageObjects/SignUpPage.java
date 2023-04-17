package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
			
	}	
		
	
	
	   @FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
		WebElement signup ;
		
		@FindBy(xpath="//option{@value='Mr'][1]")	
		WebElement title;
		
		@FindBy(xpath="//input[@id='first_name']")
		WebElement firstname;
		
		@FindBy(xpath="//input[@id='last_name']")	
		WebElement lastname;
		
		@FindBy(xpath="//select[@class='form-control form-select']")	
		WebElement country;
		
		@FindBy(xpath="//input[@id='dobDate']")	
		WebElement dateofbirth;
		
		
		@FindBy(xpath="//input[@type='tel']")	
		WebElement mobilenumber;
		
		
		@FindBy(xpath="//input[@id='email_id']")	
		WebElement emailid;
		
		
		@FindBy(xpath="//input[@id='new-password']")	
		WebElement password;
		
		
		@FindBy(xpath="//input[@id='c-password']")	
		WebElement confermpassword;
		

		@FindBy(xpath="//input[@id='defaultCheck1']")	
		WebElement checkboxagreement;
		

		@FindBy(xpath="//a/button[@type=\"button\"]")	
		WebElement submitbutton;
				
	
        public void SignUp() {
        	signup.click();
 }    
        public void SelectTitle() {
        	title.click();
 }  
        public void FirstName(String FirstName) {
        	firstname.sendKeys(FirstName);
 }
 
         public void LastName(String LastName) {
        	 lastname.sendKeys(LastName);      	 	
 }
        public void EnterCountry(String Country) {
        	country.sendKeys(Country);        		
 }
         public void DateOfBirth(String DOB) {
        	 dateofbirth.sendKeys(DOB);	
 }
        public void Mobilenumber(String MobileNumber) {
        	 mobilenumber.sendKeys(MobileNumber);      	 
 }
        public void Emailid(String EmailId) {
        	emailid.sendKeys(EmailId);
 }
       public void EnterPassword(String Password) {
    	   password.sendKeys(Password);
       }
       public void ConfermPassword(String CofermPassword) {
    	   confermpassword.sendKeys(CofermPassword);
       }
       
     public void AgreementCheck() {
    	 checkboxagreement.click();
    	 
     }
     public void SignupButton() {
    	 submitbutton.clear();
     }
}


