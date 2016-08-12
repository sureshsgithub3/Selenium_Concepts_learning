package WebDriver_Commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handling_Webtables_redbus_T7 {
	
	@Test
	public void handling_webtables(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement table=driver.findElement(By.xpath(".//*[@id='content']/table"));
		List<WebElement> headings=driver.findElements(By.xpath(".//*[@id='content']/table/thead/tr/th"));
		int hsize=headings.size();
		
		for(int i=0;i<=hsize;i++){
			String hcells=headings.get(i).getText();
			System.out.print(hcells +" \t");
		}
		
		driver.close();
		
	}

}
