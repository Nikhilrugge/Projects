package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_ShopByDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F://driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		driver.get("https://www.bestbuy.com/?intl=nosplash");
		driver.findElement(By.xpath("//button[@aria-controls='flyout-container']")).click();
		//driver.findElement(By.xpath("//button[@class='menu-item-button-178 v-fw-medium']")).click();
		driver.findElement(By.xpath("//button[@data-lid='ubr_app']")).click();
		driver.findElement(By.xpath("//button[@data-lid='ubr_app_mka']")).click();
		driver.findElement(By.xpath("//*[@id=\"header-menu-11\"]/li[8]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"widget-966b63f6-f2e1-44f8-a434-e9daf7f3bb66\"]/div/div[2]/div[1]/div[2]/div/a")).click();
	}

}
