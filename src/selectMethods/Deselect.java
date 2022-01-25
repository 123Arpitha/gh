package selectMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(day);
		System.out.println(daySelect.isMultiple());
	//	List<WebElement> options = daySelect.getOptions();
	//	for(WebElement w:options) {
	//		System.out.println(w.getText());
	//	}
		daySelect.selectByIndex(30);
		
		
		Select monthSelect = new Select(month);
		System.out.println(monthSelect.isMultiple());
	//	List<WebElement> options1 = monthSelect.getOptions();
	//	for(WebElement w1:options1) {
	//		System.out.println(w1.getText());
	//		}
		monthSelect.selectByValue("8");
		
		Select yearSelect = new Select(year);
		System.out.println(yearSelect.isMultiple());
	//	List<WebElement> options2 = yearSelect.getOptions();
	//	for(WebElement w2:options2) {
	//		System.out.println(w2.getText());
	//	}
		yearSelect.selectByVisibleText("1999");
		
		daySelect.deselectByIndex(30);
		Thread.sleep(2000);
		monthSelect.deselectByVisibleText("Aug");
		Thread.sleep(2000);
		yearSelect.deselectByValue("1999");
		
		
		
	}

}
