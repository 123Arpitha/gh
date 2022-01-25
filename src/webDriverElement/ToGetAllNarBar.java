package webDriverElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllNarBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		 List<WebElement> navBar = driver.findElements(By.xpath("//nav[@data-reactid]"));
		 for(WebElement w:navBar)
		 {
			 System.out.println(w.getText());
		 }
		
	}

}
