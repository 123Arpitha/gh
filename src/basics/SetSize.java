package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.skillrary.com/");
			Dimension d = new Dimension(1237,1382);
			driver.manage().window().setSize(d);
			 
			
	}

}
