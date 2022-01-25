package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Set<String> d = driver.getWindowHandles();
		for(String s:d)
		{
			System.out.println(s);
		}
		driver.quit();
	}

}
