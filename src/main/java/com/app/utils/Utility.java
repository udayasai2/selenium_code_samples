package com.app.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void captureScreenshot(WebDriver driver,String screenshotname) throws Exception {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname +".png"));
			System.out.println("Screenshot is taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot is "+e.getMessage());
		} 
	}
}
