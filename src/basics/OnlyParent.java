package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyParent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String expectedParentPage = driver.getWindowHandle();
		Set<String> allWinID = driver.getWindowHandles();
		allWinID.remove(expectedParentPage);
		for(String s:allWinID)
		{
			driver.switchTo().window(s);
			Thread.sleep(2000);
			driver.close();
		}

	

	driver.switchTo().window(expectedParentPage);
	driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Manual testing");
	
	}
}

