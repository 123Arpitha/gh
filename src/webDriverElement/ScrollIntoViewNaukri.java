package webDriverElement;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewNaukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		WebElement elementScroll = driver.findElement(By.xpath("//h2[text()='Trending on Naukri today']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500););*/
		
		js.executeScript("arguments[0].scrollIntoView(true);",elementScroll);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -100);");
		
	}

}
