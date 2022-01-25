package flipkart;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.lang.NumberFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fli2 {

	public static void main(String[] args) throws InterruptedException,NumberFormatException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("boat smart watch");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		 String value = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
		 String price = value.toString();
		String pric=price.replaceAll("[^\\d.]","");
		int val = Integer.parseInt(pric);
		System.out.println(val);
		if(val<=6000)
			{
			String parentWin = driver.getWindowHandle();
			Set<String> allWin = driver.getWindowHandles();
			allWin.remove(parentWin);
			String expectTitle="boAt Storm Smartwatch Price in India - Buy boAt Storm Smartwatch online at Flipkart.com";
			
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
				driver.findElement(By.xpath("//span[text()='Cart']")).click();
			}
			else
			{
				System.out.println("watch price is greater than 6000");
			}
		}
		
		
		
		
	}


