package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWinID = driver.getWindowHandles();
		String expectedParentPageTitle = "Jobs - Recruitment - Job Search -  Employment - Job Vacancies - Naukri.com";	
		for(String s:allWinID)
		{
			driver.switchTo().window(s);
			String actualPageTitle = driver.getTitle();
			if(!expectedParentPageTitle.equals(actualPageTitle))
			{
				driver.close();
		    }
		}
		driver.switchTo().window(expectedParentPageTitle);
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Manual testing");
		
	}

}
