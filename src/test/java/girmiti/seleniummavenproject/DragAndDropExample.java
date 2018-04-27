package girmiti.seleniummavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DragAndDropExample {
	@Test
	public void dragAndDrop() {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		WebDriverWait wait=new WebDriverWait(driver,15);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Droppable")));
		element.click();
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();;
		
		
	}
}
