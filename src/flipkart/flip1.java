package flipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class flip1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).click();
		addToCart(driver,"Iphone- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("vivo",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='vivo V23 Pro 5G (Stardust Black, 256 GB)']")).click();
		addToCart(driver,"Vivo- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("mi",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Redmi 9A (SeaBlue, 32 GB)']")).click();
		addToCart(driver,"Mi- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Cart")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));
	}
	public static void addToCart(WebDriver driver,String expectTitle) {
		String parentWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		allWin.remove(parentWin);
		
		
		for(String s:allWin)
		{
			driver.switchTo().window(s);
			String actuTitle=driver.getTitle();
			if(expectTitle.equals(actuTitle))
			{
				System.out.println("driver switched control to a parent page");
			}
			
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.switchTo().window(parentWin);

	}

}
