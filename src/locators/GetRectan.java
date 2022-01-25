package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Rectangle rect = driver.findElement(By.id("email")).getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		Rectangle rect2 = driver.findElement(By.id("passContainer")).getRect();
		System.out.println(rect2.getX());
		Thread.sleep(2000);
		System.out.println(rect2.getY());
		Thread.sleep(2000);
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getWidth());
		
	}

}
