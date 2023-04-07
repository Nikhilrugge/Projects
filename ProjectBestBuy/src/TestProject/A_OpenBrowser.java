package TestProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class A_OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F://driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		driver.get("https://www.bestbuy.com/?intl=nosplash");
			
	}

}
