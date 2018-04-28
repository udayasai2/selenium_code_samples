package com.facebook.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.app.utils.Utility;

public class ScreenShotExample {
	@Test
	public void takeScreenShot() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Utility.captureScreenshot(driver, "browserlaunch");
		driver.findElement(By.name("firstname")).sendKeys("udaya");
		Utility.captureScreenshot(driver, "firstname");
		
	}
}
