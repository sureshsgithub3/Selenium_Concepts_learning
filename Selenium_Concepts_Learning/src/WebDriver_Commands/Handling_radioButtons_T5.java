package WebDriver_Commands;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_radioButtons_T5 {
	
	
	@Test
	public void handle_rwbuttons(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//storing radiobutton in alist
		List<WebElement> Rbuttons= driver.findElements(By.name("sex"));
		
		Boolean bval=false;
		
		bval=Rbuttons.get(0).isSelected();
		if(bval=true){
			Rbuttons.get(1).click();
		             }
			else
			{
				Rbuttons.get(0).click();
				
			}
		
		//clicking years of experince in 3
		driver.findElement(By.id("exp-2")).click();
		
		//storing type of testing in list
		List<WebElement> type=driver.findElements(By.name("profession"));
		
		int typesize=type.size();
		
		for(int i=0;i<typesize;i++){
			String testingtype=type.get(i).getAttribute("value");
			
			if(testingtype.equalsIgnoreCase("Automation Tester")){
				type.get(i).click();
				//this will click automation tester only
				break;
				//this exists loop
			}
		}
		driver.close();
			
			
			
		
	}
	
	

}
