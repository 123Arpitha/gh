package basics;

import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		Point p= driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
	}

}
