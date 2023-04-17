package pageObjects;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OnewayTripPage {
public WebDriver driver;
	
	public OnewayTripPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
			
	}
	@FindBy(xpath="//div[contains(text(),'one way')]")
	WebElement onewaytripbutton;
	
	@FindBy(xpath="//div[contains(text(),'From')]")
	WebElement FROM;
	
	@FindBy(xpath="//div[contains(text(),'To')]")
	WebElement To;
	
	@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'][1]")
	WebElement departuredate;
	
	@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'][2]")
	WebElement returndate;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflightbutton;
	
	public void OnewayTripButton (){
		onewaytripbutton.click();
	}

	public void From(String From) {
		FROM.sendKeys(From);
	}
	
	public void To(String to) {
		To.sendKeys(to);
	}
	
	public void DepartureDate() {
		departuredate.click();
	}
	
	public void ReturnDate() {
		returndate.click();
	}
	
	public void SearchFlight() {
		searchflightbutton.click();
	}
	
}
