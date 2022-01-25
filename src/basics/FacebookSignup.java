package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Arpitha");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("G");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("7760153237");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='New password']")).sendKeys("776gjhlj");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("option[value='31']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("month")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Aug']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("year")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("option[value='1999']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='sex']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		
		
	}

}
