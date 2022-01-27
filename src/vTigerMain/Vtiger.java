package vTigerMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import reasdingData.ExcelLib;
import vTiger.LoginPage;

public class Vtiger {
	@Test
	public  void delete_MultipleInvoiceDetails_FromListView() {
		String testURL = ExcelLib.readStringData("Sheet3", 0, 0);
		String username = ExcelLib.readStringData("Sheet3", 0, 1);
		String password = ExcelLib.readStringData("Sheet3", 0, 2);
		String expectedLoginPageTitle=ExcelLib.readStringData("Sheet3", 0, 3);
	//	String expectedHomePageTitle=ExcelLib.readStringData("Sheet3", 0, 4);
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(testURL);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page displayed successfully");
		}
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsernameTextField().sendKeys(username);
		loginPage.getPasswordTextField().sendKeys(password);
		loginPage.getSubmittButton().click();
		
		
		
		
		
		
		
		
	}
}
