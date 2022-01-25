package webDriverElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreChromeInWebDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
		//web page
		driver.get("https://www.zomato.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File destFile=new File("./pictures/scr4.png");
		FileUtils.copyFile(temp, destFile);
		//web elements
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File wescr = driver.findElement(By.xpath("//img[@alt='Order Food Online']")).getScreenshotAs(OutputType.FILE);
		System.out.println(wescr);
		File weDesrn= new File("./pictures/wesc3.png");
		FileUtils.copyFile(wescr, weDesrn);
	}

}
