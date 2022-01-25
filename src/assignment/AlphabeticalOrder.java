package assignment;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		TreeSet<String>  t = new TreeSet<String>();
		Set<String> allWinIds = driver.getWindowHandles();
		for(String s:allWinIds)
		{
			driver.switchTo().window(s);
			t.add(driver.getTitle());
		}
		for(String t1:t)
		{
			System.out.println(t1);
		}
	}

}
