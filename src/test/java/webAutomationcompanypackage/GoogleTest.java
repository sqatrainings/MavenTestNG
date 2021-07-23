package webAutomationcompanypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class GoogleTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
       
		driver =new ChromeDriver();
					
		
	}
	
	@Test
	public void googleSearch()
	
	{
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.quit();
		
	}

}
