package girmiti.seleniummavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsPopup {
	
	@Test
	public void windowsPopup() {
		System.setProperty("webdriver.chrome.driver", "..\\exes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Udaya Kumar\\Desktop\\TestData.xls");
	}
}
