package com.undostres.testCases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static Properties prop;

	public static WebDriver driver;
	public String operatorDrop= "telcel";
	public String baseURL="https://undostres.com.mx";
	public String mobile="8465433546";
	public String amount="$10";
	public String cardno= "4111111111111111";
	public String cardm= "11";
	public String cardy= "25";
	public String cvv= "111";
	public String cname= "test@test.com";
	public String username= "automationUDT1@gmail.com";
	public String password="automationUDT123";
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public static void launchApp() {
	
		String browserName = prop.getProperty("browser");
		
		if (browserName.contains("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		} else if (browserName.contains("FireFox"))
		{
			driver = new FirefoxDriver();
		} else if (browserName.contains("IE")) {
			driver = new InternetExplorerDriver();
		}
		
		
		
		
	}
	private static void implicitWait(WebDriver driver2, int i) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void closeDown()
	{
		driver.quit();
	}
	
			

}
