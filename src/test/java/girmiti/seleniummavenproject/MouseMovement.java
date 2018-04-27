package girmiti.seleniummavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseMovement {
	@Test
	public void mouseMovement() {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement element=driver.findElement(By.id("lst-ib"));
		element.sendKeys("spicejet");
		element.submit();
		driver.findElement(By.xpath("//a[@id='vn1s0p1c0']")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='smoothmenu1']//a[@id='highlight-addons']"))).build().perform();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement element1=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Hot Meals")));
		element1.click();
	}
}
