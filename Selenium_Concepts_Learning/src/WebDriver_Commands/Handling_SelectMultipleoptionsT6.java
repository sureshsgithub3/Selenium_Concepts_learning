package WebDriver_Commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handling_SelectMultipleoptionsT6 {
	
	
	@Test
	 public void handle_multiplevalues(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	Select select=new Select(driver.findElement(By.id("selenium_commands")));
		List<WebElement> opts=driver.findElements(By.xpath(".//*[@id='selenium_commands']/option"));
		
		int size= opts.size();
		
		/*for(int i=0;i<size;i++){
			String optnvalue=opts.get(i).getText();
			//select all values
			select.selectByIndex(i);
			
			
		}*/
		
	    
		
		for(int j=0;j<size;j++){
			String optnvalue1=opts.get(j).getText();
			//select
			if(optnvalue1.equalsIgnoreCase("Browser Commands")){
				select.selectByIndex(j);
			}else if(optnvalue1.equalsIgnoreCase("Navigation Commands")){
					select.selectByIndex(j);
			}else if(optnvalue1.equalsIgnoreCase("Navigation Commands")){
				    select.selectByIndex(j);
			}
				
			
			
		}
	}

}
