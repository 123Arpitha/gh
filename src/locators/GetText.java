package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedHead = "Please identify yourself";
		String ActualHead = driver.findElement(By.id("headerContainer")).getText();
		if(expectedHead.equals(ActualHead))
		{
			System.out.println(ActualHead);
		}
		else
		{
			System.out.println("not a proper message");
		}
			
	}
 
}
