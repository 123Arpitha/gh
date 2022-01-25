package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlphaOrderPrintTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		driver.get("https://company.naukri.com/landing-page/techmahindra/hackthon/9dec2021/index.html");
		System.out.println(driver.getTitle());
		driver.get("https://company.naukri.com/popups/icici/23072021/index.html");
		System.out.println(driver.getTitle());
		driver.get("https://company.naukri.com/popups/techmahindra/13dec2021/index.html");
		System.out.println(driver.getTitle());
//		driver.
	}

}
