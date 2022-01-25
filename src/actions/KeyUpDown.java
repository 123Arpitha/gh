package actions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait expliciWait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.myntra.com/");
		 List<WebElement> navbar = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		
		Actions actions = new Actions(driver);
		for(WebElement w: navbar ) {
			actions.keyDown(Keys.SHIFT).click(w).perform();
			actions.keyUp(Keys.SHIFT).perform();
			}
		String parentWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		allWin.remove(parentWin);
		for(String s:allWin) {
			driver.switchTo().window(s);
			String expectTitle="Home and Living - Buy Interior Decoration Products and Accessories Online in India";
			String actTitle = driver.getTitle();
			if(expectTitle.equals(actTitle)) {
				driver.close();
			}
			
		}
			
	}

}
