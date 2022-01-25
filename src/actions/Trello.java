package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait expliciWait = new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/en/login");
		driver.findElement(By.id("user")).sendKeys("gowdaarpitha009@gmail.com");
		expliciWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("123@Arpitha");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		
		Actions actions = new Actions(driver);
		expliciWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[text()='To Do']")));
		
		Thread.sleep(2000);
		WebElement manual = driver.findElement(By.xpath("//span[text()='Manual']"));
		WebElement doing = driver.findElement(By.xpath("//h2[text()='Doing']/../..//span[text()='Add a card']"));
		actions.clickAndHold(manual).moveByOffset(386,389).perform();
		Thread.sleep(3000);
		actions.release().perform();
		
		
		
		
		
		
		
		
	}

}
