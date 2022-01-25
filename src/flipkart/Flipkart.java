package flipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String parentWinId = driver.getWindowHandle();
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("iphone12",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']")).click();
		Set<String> allWin = driver.getWindowHandles();
		allWin.remove(parentWinId);
		String excptedTitle = "Iphone12- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		for(String s:allWin)
		{
			driver.switchTo().window(s);
			String actualTitle = driver.getTitle();
			if(excptedTitle.equals(actualTitle))
			{
				System.out.println("driver switched control to the parent page");
			}
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("g[fill-rule='evenodd']")).click();
		driver.findElement(By.partialLinkText("SAMSUNG Galaxy F12")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("g[fill-rule='evenodd']")).click();
		driver.findElement(By.partialLinkText("OPPO A53s 5G")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		driver.findElement(By.xpath("//span[text()='Cart'")).click();
		
		
		
		
		
		

		
	}

}
