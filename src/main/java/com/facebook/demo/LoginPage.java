package com.facebook.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("udaya");
		driver.findElement(By.id("u_0_m")).sendKeys("jagarlamudi");
		driver.findElement(By.id("u_0_p")).sendKeys("udayasai@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("udayasai@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("aml12uday");
		WebElement day_dropdown=driver.findElement(By.id("day"));
		Select day=new Select(day_dropdown);
		
		WebElement selected_value=day.getFirstSelectedOption();
		System.out.println("selected value before selection is : "+selected_value.getText());
		
		day.selectByIndex(17);
		WebElement selected_value1=day.getFirstSelectedOption();
		System.out.println("selected value after selection is : "+selected_value1.getText());
		
		//Assert.assertEquals(17,selected_value1,"test case is passed");
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month=new Select(month_dropdown);
		month.selectByValue("3");
		WebElement year_dropdown=driver.findElement(By.id("year"));
		Select year=new Select(year_dropdown);
		year.selectByVisibleText("1980");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.id("u_0_12")).click();
		}
}
