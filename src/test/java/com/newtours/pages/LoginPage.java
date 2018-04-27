package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	
	By Password=By.name("password");
	By submit_button=By.name("login");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	/*public void loginToApplication(String username,String password) {
		driver.findElement(User_Name).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(submit_button).click();
	}*/
	
	public void typeUserName(String username) {
		By User_Name=By.name("userName");
		WebElement ee=LoginPage.this.driver.findElement(User_Name);
		ee.sendKeys(username);
	}
	
	public void typePassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	
	public void clickOnSubmitButton() {
		driver.findElement(submit_button).click();
	}
	}
