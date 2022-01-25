package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ltd = LocalDateTime.now();
		int day = ltd.getDayOfMonth();
		String month = ltd.getMonth().name();
		System.out.println(month);
		month=month.substring(0,1).toUpperCase()+month.substring(1,3).toLowerCase();
		System.out.println(month);
		int year = ltd.getYear();
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://in.via.com/");
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		driver.findElement(By.xpath("//input[@id='departure']/..//div[@class='calendar-icon']")).click();
		
		driver.findElement(By.xpath("//span[text()='"+month+"']/../..//span[text()='" +year+"']/../..//div[text()='"+day+"']")).click();
	}

}
