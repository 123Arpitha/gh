package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWinID = driver.getWindowHandles();
		String expectedTitle = "ICICI";
		for(String s:allWinID)
		{
			driver.switchTo().window(s);
		
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle))
			{
				driver.manage().window().maximize();
				break;
			}
		}
	}

}
