package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		// TODO Auto-generated me
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.close();
		
		
		
	}

}
