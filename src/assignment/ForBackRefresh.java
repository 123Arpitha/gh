package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ForBackRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://www.skillrary.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

}
