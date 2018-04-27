package girmiti.seleniummavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenBrowser {
	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "..\\exes\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void getTitle() {
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=FlXDWs_jMM6dX5SdlIgD");
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		Assert.assertTrue(title.equalsIgnoreCase("Google"), "Page Title does not match");
	}

	@AfterClass
	public void close() {
		driver.close();
	}
}
