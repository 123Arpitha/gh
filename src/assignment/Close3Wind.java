package assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close3Wind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWin = driver.getWindowHandles();
		String ExThirdrdWinTitle = "ICICI";
		for (String s:allWin)
		{
			driver.switchTo().window(s);
			String ActThirdrdWinTitle=driver.getTitle();
			if(ExThirdrdWinTitle.equals(ActThirdrdWinTitle))
			{
				driver.close();
			}
		}
	}

}
