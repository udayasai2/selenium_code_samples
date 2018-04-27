import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestingExample {
  
	WebDriver driver;
  
	@Test
	public void loginToApplication() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("identifierId")).sendKeys("udayasai");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("amluuday");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
	}
  
}
