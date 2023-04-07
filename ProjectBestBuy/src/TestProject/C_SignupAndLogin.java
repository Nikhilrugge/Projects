package TestProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_SignupAndLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		driver.get("https://www.bestbuy.com/identity/signin?token=tid%3Aacb4376a-d2c7-11ed-9c72-0294befd8939");
		
		driver.findElement(By.id("fld-e")).sendKeys("nikhilrugge.05@gmail.com");
		driver.findElement(By.id("fld-p1")).sendKeys("Best_Buy@05");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div/div/form/div[3]/button")).click();
		
		
		
		
		
			

	}

}
