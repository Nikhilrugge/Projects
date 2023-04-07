package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F://driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		driver.get("http://www.bestbuy.com/?intl=nosplash");
		
		driver.findElement(By.id("gh-search-input")).sendKeys("apple watch");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@data-sku-id='6340256']")).click();

	}

}
