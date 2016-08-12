package WebDriver_Commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handling_DropDowns_T6 {
	
    @Test
    public void handle_dropdowns(){
    	WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("continents")).click();
		// drop down handle 
		Select select= new Select(driver.findElement(By.id("continents")));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//storing _all droppping options in to list
		List<WebElement> contnts= driver.findElements(By.xpath(".//*[@id='continents']/option"));
		
		int size= contnts.size();
		
		//select by index
		for(int i=0;i<size;i++){
			String cname=contnts.get(i).getAttribute("value");
			System.out.println(cname);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			select.selectByIndex(i);
			
		}
       	System.out.println("=========================");
		
		
		// select by visible text
		for(int j=0;j<size;j++){
			String cname1=contnts.get(j).getAttribute("value");
			System.out.println(cname1);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			select.selectByVisibleText(cname1);
			
		}
		//print all options
		
		Select select3=new Select(driver.findElement(By.id("continents")));
		List<WebElement> options=select3.getOptions();
		
		for(WebElement ele:options){
			System.out.println(ele.getText());
			
		}
		
		
		driver.close();	
		}
		
    }



