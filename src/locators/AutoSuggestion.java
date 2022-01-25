package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		  List<WebElement> suggestions = driver.findElements(By.xpath("//li[@role='presentation' and @class='sbct']"));
		  System.out.println("the number of auto suggestion are:"+suggestions.size());
		 for(WebElement w: suggestions)
		{
			System.out.println(w.getText());
		}
	}
	

}
