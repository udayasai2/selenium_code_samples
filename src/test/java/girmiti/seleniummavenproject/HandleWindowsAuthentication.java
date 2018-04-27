package girmiti.seleniummavenproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowsAuthentication {
	@Test
	public void handleWindowsAuthentication() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\STBJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://engprod-charter.net");
		Runtime.getRuntime().exec("C:\\Users\\Udaya Kumar\\Desktop\\AutoIT\\HandleWindowsAuthentication.exe");
	}
}


/*AutoITScript: write the below script in the editor and save and compile
 
WinWaitActive("Authentication Required")
Send("validusername")
Send("{TAB}")
Send("validpassword")
Send("{ENTER}")*/

