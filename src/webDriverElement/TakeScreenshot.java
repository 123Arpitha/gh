package webDriverElement;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
			
			driver.get("https://www.zomato.com/");
			 File temp = driver.getScreenshotAs(OutputType.FILE);
			System.out.println(temp);
			
			File dest= new File("./pictures/scr1.png");
			temp.renameTo(dest);
			File wescr = driver.findElement(By.xpath("//img[@alt='Order Food Online']")).getScreenshotAs(OutputType.FILE);
			System.out.println(wescr);
			File weDesrn= new File("./pictures/wesc1.png");
			wescr.renameTo(weDesrn);
			Thread.sleep(5000);
			
			
		}
}
