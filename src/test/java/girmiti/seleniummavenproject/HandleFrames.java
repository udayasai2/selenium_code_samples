package girmiti.seleniummavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleFrames {
	@Test
	public void frameHandling() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("udayakumar");
		driver.findElement(By.name("password")).sendKeys("udayakumar");
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		//Wait w=new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		/*
		 * driver.findElement(By.xpath("//input[@value='Login']")).click();
		 * driver.findElement(By.xpath("//input[@type='submit'][@value='Login']")).click
		 * ();
		 * driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).
		 * click();
		 * driver.findElement(By.xpath("//input[@type='submit' or @value='Login']")).
		 * click();
		 */
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}
}
