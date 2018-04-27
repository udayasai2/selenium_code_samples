package girmiti.seleniummavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleVerification {
	@Test
	public void verifyPageTitle() {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://learn-automation.com");
		String title=driver.getTitle();
		String expected_title="Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Ste";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, expected_title);
		sa.assertAll();
		//System.out.println("title of the page is "+title);
		
		//Assert.assertTrue(title.contains("Selenium WebDriver tutorial"));
		//Assert.assertEquals(title, expected_title);
		System.out.println("test is passed");
		
	}
}
