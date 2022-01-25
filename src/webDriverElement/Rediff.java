package webDriverElement;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter name or email' and  @id='TO_IDcmp2']")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Arpitha G");
		Thread.sleep(2000);
		
		 WebElement frame = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		 driver.switchTo().frame(frame);
		 driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Wririting automation script");
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(2000);
		for(;;)
		{
			try {
			driver.findElement(By.xpath("//span[@title='Arpitha G']/..//cite[@title='Select mail']")).click();
			driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del']")).click();
			driver.findElement(By.xpath("//button[text()='Ok']")).click();
			break;
		}
		catch(NoSuchElementException e){
			driver.navigate().refresh();
		}
		
	}

	}
}
