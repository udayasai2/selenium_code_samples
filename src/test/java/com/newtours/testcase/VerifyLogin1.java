package com.newtours.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.newtours.pages.LoginPage;

public class VerifyLogin1 {
	WebDriver driver;
	
	@Test
	public void verifyLoginPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		LoginPage login=new LoginPage(driver);
		/*login.typeUserName("udayasai@gmail.com");
		login.typePassword("aml12uday");
		login.clickOnSubmitButton();*/
		//login.loginToApplication("udayasai@gmail.com", "aml12uday");
		String title=driver.getTitle();
		System.out.println("title of the page is : "+title);
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
		driver.quit();
	}

}
