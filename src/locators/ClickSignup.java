package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uber.com/in/en/");
		Thread.sleep(2000);
		driver.findElement(By.className("cq cr bp cs ct cu cv cw cx cy cz d0 bf d1 cb d2 d3 d4 d5 bj d6 d7 d8 b9 b7 bk b8 bv c5 bw dp dq dr ds dt du dv dw dx bu fk dj iq ip e1 ir is"));
		}

}
