package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTiltle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		String d = driver.getTitle();
		System.out.println(d);
	}

}
