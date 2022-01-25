package reasdingData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import flipkart.ExcelLib;

public class NaukriLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Data
		
		String testUrl = ExcelLib.readStringData("Sheet1", 0, 0);
		String username = ExcelLib.readStringData("Sheet1", 0, 1);
		String password = ExcelLib.readStringData("Sheet1", 0, 2);
		String expectedLoginPageTitle = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		String expectedHomePageTitle = "Home | Mynaukri";
		
		//Step1:Open the browser and enter the URL
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser maximized successfully");
		WebDriverWait explictWait = new WebDriverWait(driver,10);
		driver.get(testUrl);
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle))
		{
			System.out.println("Login page displayed successfully");
		}
		else
		{
			System.out.println("Login page not displayed successfully");
		}
		
		//Step 2:Click on Login Link
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String actualLoginPageTitle1 = driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle1))
		{
			System.out.println("Login page displayed successfully");
		}
		else
		{
			System.out.println("Login page not displayed successfully");
		}
		
		
		
		//Step3:Enter the email/Username into username Text field
		 WebElement usernameTextField = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered = usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(username))
		{
			System.out.println("Username is entered correctly");
		}
		else
		{
			System.out.println("Username is not entered correctly");
		}
		
		//Step 4:Enter password into the password Text field
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if(actualPasswordEntered.equals(password))
		{
			System.out.println("password is entered correctly");
		}
		else
		{
			System.out.println("password is not entered correctly");
		}
		
		//Step 5:Click on Login button
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		explictWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle))
		{
			System.out.println("Home page displayed successfully");
		}
		else
		{
			System.out.println("Home page not displayed successfully");
		}

	}

}
