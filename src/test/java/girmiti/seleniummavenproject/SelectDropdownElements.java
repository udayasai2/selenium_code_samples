package girmiti.seleniummavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

// selecting all the dropdown elements
public class SelectDropdownElements {
	@Test
	public void dropDownSelect() {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*WebElement element=driver.findElement(By.id("day"));
		Select select=new Select(element);*/
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("29");
		List<WebElement> list=select.getOptions();
		int listsize=list.size();
		for(int i=0;i<listsize;i++) {
			String s=list.get(i).getText();
			System.out.println("Values in the list are : "+s);
			if(s.equals("3")) {
				select.selectByVisibleText("3");
				break;
			}
		}
		
		
	}
}
