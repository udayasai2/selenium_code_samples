import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SampleExercise {
	@Test
	public void dateSelect() throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");	
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		driver.findElement(By.id("dest")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		//driver.findElement(By.xpath("//input[starts-with(@class,'')]"))
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td")));
		element.click();
		//Thread.sleep(5000);
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		int total_node=dates.size();
		System.out.println("total nodes in the web table : "+total_node);
		for(int i=0;i<total_node;i++) {
			String date=dates.get(i).getText();
			if(date.equals(31)) {
				dates.get(i).click();
				break;
			}
		}		
	}
}
