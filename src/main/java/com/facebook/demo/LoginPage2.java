package com.facebook.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage2 {
	@Test
	public void loginPage2() {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement day_dropdown=driver.findElement(By.id("day"));
		Select day=new Select(day_dropdown);
		List<WebElement> day_list=day.getOptions();
		int day_count=day_list.size();
		Assert.assertEquals(day_count, 32,"test case is passed");
		System.out.println("total num of days is "+day_count);
		for(WebElement temp:day_list) {
			String day_value=temp.getText();
			System.out.println(day_value+" ");
		}
	}
}
