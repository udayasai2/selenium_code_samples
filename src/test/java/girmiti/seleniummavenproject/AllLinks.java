package girmiti.seleniummavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinks {
	@Test
	public void allLinks() {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println("total number of links : "+alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			String linktext=alllinks.get(i).getText();
			System.out.println(linktext);
		}
	}
}
