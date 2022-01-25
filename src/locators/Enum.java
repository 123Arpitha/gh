package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enum {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.name("username"));
		user.clear();
		user.sendKeys("Arp","itha"," G","@gmail",".com",Keys.CONTROL+"a");
		Thread.sleep(2000);
		user.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		Thread.sleep(2000);
		pwd.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Keys.ENTER);
		

	}

}
