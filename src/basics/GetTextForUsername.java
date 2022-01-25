package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForUsername {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("Arpi","tha");
		driver.findElement(By.xpath("//div[text()='Login '] ")).click();
		Thread.sleep(2000);
		String expected = "Username or Password is invalid. Please try again.";
		String actual = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
		if(expected.equals(actual))
		{
			System.out.println(actual);
		}
		else
		{
			System.out.println("it is not displaying proper");
		}
	}

}
