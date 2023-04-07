package TestProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_ValidatingTitles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/?intl=nosplash");
		
		driver.findElement(By.xpath("//button[@aria-controls='flyout-container']")).click();
		
		//validate shop by department
		//driver.findElement(By.xpath("//button[@class='menu-item-button-178 v-fw-medium']")).click();
		
		//validate title deals
		driver.findElement(By.xpath("//button[@class='menu-item-button-1 v-fw-medium']")).click();
		
		//validate support and services
		driver.findElement(By.xpath("//button[@class='menu-item-button-5 v-fw-medium']")).click();
		
		//validate brands
		driver.findElement(By.xpath("//button[@class='menu-item-button-8 v-fw-medium']")).click();	
		
		//validate featured
		driver.findElement(By.xpath("//button[@class='menu-item-button-9 v-fw-medium']")).click();

	}

}
