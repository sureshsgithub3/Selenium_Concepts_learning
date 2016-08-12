package Taking_ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Taking_Screen_Shot {
	WebDriver driver;
	
	public void getscreenshot() throws Exception{
		File ScrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//below method will save the screen shot in the driver with screenshot.jpg
		FileUtils.copyFile(ScrFile, new File("C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\ScreenShotsFolder\\Failedscreenshot.jpg"));
		
	}
	
	@Test
	public void takingscreenshot() throws Exception{
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	
	
	
	
	try{
		//this below statement will not found an element is not found ,catch block will get executed and takes the screenshot
		driver.findElement(By.id("test")).sendKeys("testing");
		//if we remove the below comment ,it will not return exception and screen shot method will not get executed .
		  driver.findElement(By.id("lst-ib")).sendKeys("testing");
		  
	}catch(Exception e){
		System.out.println("delbirate exception");
		//calls the method to take screen shot
		getscreenshot();
		
	}
	
	}

}
